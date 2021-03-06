package com.cloudbees.jenkins.GitHubSetCommitStatusBuilder

import com.cloudbees.jenkins.GitHubSetCommitStatusBuilder

def f = namespace(lib.FormTagLib);

// prepare default instance
if (instance == null) {
    instance = new GitHubSetCommitStatusBuilder()
}

f.dropdownDescriptorSelector(title: _('Commit context: '), field: 'contextSource')

f.advanced() {
    f.entry(title: _('Build status message'), field: 'statusMessage') {
        f.property()
    }
}
