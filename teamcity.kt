package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object MatlabBuild : BuildType({
    name = "MATLAB_Build"

    artifactRules = "matlabTestArtifacts"

    vcs {
        root(AbhargavMw)
    }
    steps {
        step {
            type = "matlabRunnerType"
            param("MatlabMessageKey", "pwd, disp('Building MEX File'), buildMEXfiles, runAllTests")
            param("MatlabPathKey", "/mnt/f/MATLAB_21b_Linux/bin/matlab")
        }
    }})
