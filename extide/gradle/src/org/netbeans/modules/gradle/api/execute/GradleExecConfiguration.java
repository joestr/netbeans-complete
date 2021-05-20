/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.gradle.api.execute;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.netbeans.api.annotations.common.NonNull;
import org.netbeans.modules.gradle.execute.GradleExecAccessor;
import org.netbeans.spi.project.ProjectConfiguration;

/**
 * Represents a configuration for the Gradle project.  Configurations can modify the build
 * by supplying specific project properties (-P), or specific commandline arguments (--debug)
 * for all executed tasks. In addition, individual actions can be customized in the configuration
 * to take different parameters.
 * 
 * @author sdedic
 */
public final class GradleExecConfiguration implements ProjectConfiguration {
    /**
     * Token that represents ID of the <b>default</b> configuration.
     */
    public static final String DEFAULT = "%%DEFAULT%%";

    /**
     * Token that represents ID of the <b>active</b> configuration.
     */
    public static final String ACTIVE = "%%ACTIVE%%";
    
    /**
     * ID of the configuration. Cannot be changed; serves as an identification.
     */
    private final @NonNull String id;
    
    /**
     * Descriptive name. Used mainly for builtin configurations. May be {@code null}
     */
    private String displayName;
    
    /**
     * Project properties effective in this configuration.
     */
    private Map<String, String> projectProperties;
    
    /**
     * Gradle commandline added in the configuration.
     */
    private String commandLineArgs;
    
    /**
     * Package private to prevent subclassing.
     * @param id configuration ID.
     */
    GradleExecConfiguration(@NonNull String id) {
        this.id = id;
    }

    /**
     * Retursn ID of the configuration. For builtin or provided configurations, the ID
     * may be different from (localized) {@link #getDisplayName()}. The default configuration
     * uses {@link #DEFAULT}.
     * 
     * @return configuration ID.
     */
    public @NonNull String getId() {
        return id;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    public @NonNull Map<String, String> getProjectProperties() {
        return projectProperties;
    }

    public String getCommandLineArgs() {
        return commandLineArgs;
    }
    
    public @NonNull String getName() {
        if (displayName != null) {
            return displayName;
        } else {
            return id;
        }
    }
    
    void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    void setProjectProperties(Map<String, String> projectProperties) {
        this.projectProperties = projectProperties;
    }

    void setCommandLineArgs(String commandLineArgs) {
        this.commandLineArgs = commandLineArgs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GradleExecConfiguration other = (GradleExecConfiguration) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    static {
        GradleExecAccessor.setInstance(new GradleExecAccessor() {
            @Override
            public GradleExecConfiguration create(String id, String dispName, Map<String, String> projectProps, String cmdline) {
                GradleExecConfiguration cfg = new GradleExecConfiguration(id);
                cfg.setDisplayName(dispName);
                cfg.setCommandLineArgs(cmdline);
                cfg.setProjectProperties(new HashMap<>(projectProps));
                return cfg;
            }

            public GradleExecConfiguration update(
                    GradleExecConfiguration conf,
                    String dispName, Map<String, String> projectProps, String cmdline) {
                conf.setDisplayName(dispName);
                conf.setProjectProperties(projectProps);
                conf.setCommandLineArgs(cmdline);
                return conf;
            }
        });
        
    }
}
