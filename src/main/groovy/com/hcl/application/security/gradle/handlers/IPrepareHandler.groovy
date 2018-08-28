/**
 * @ Copyright HCL Technologies Ltd. 2018.
 * LICENSE: Apache License, Version 2.0 https://www.apache.org/licenses/LICENSE-2.0
 */

package com.hcl.application.security.gradle.handlers

import com.hcl.appscan.sdk.scan.ITarget

interface IPrepareHandler {

    List<ITarget> getTargets()
}