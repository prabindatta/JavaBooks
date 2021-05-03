/*
 * Copyright 2019 Wuyi Chen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.services.DiscoveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The controller class for discovery service.
 * 
 * @author  Wuyi Chen
 * @date    06/10/2019
 * @version 1.0
 * @since   1.0
 */
@RestController
@RequestMapping(value="v1/tools")
public class DiscoveryServiceController {
    @Autowired
    private DiscoveryService discoveryService;

    /**
     * Get list of service names which is registered with the eureka server.
     * 
     * @return  The list of service names.
     */
    @RequestMapping(value = "/eureka/services", method = RequestMethod.GET)
    public List<String> getEurekaServices() {
        return discoveryService.getEurekaServices();
    }
}
