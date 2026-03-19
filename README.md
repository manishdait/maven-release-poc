# maven-release-poc
This repository demonstrates how to release Maven artifacts using JReleaser and GitHub Actions. It automates versioning, artifact building, and publishing to Maven Central.

## Prerequisites

Before releasing artifacts, you need to prepare the following:

**1. Create a Sonatype (Maven Central) account**

- Sign up at [Sonatype](https://central.sonatype.com/).

- Once approved, you will receive access to deploy artifacts to Maven Central.

**2. Create a Maven Namespace**
- This is the `groupId` under which your artifacts will be published.

- Example: `io.github.<your-github-username>`

**3. Generate a GPG key**

- Run the following command:
```
gpg --gen-key
```

- Export your keys:
```
gpg --armor --export <KEY ID> 
gpg --armor --export-secret-keys <KEY ID>
```

- Distributing Your public key
```
gpg --keyserver keyserver.ubuntu.com --send-keys <KEY ID>
```

- Add these keys as GitHub repository secrets:

| Secret | Name	Value |
|---|--|
| `GPG_PR_KEY` |	private.key content |
| `GPG_PUB_KEY` |	public.key content |
| `GPG_PARSE` |	passphrase for the private key |


**4. Create a Sonatype token**

- Generate a `username/password` token for Maven Central access.

- Add the following GitHub secrets:

| Secret | Name	Value |
|---|---|
| `MAVEN_TOKEN_USERNAME` |	your Sonatype username |
| `MAVEN_TOKEN_PASSWORD` |	your Sonatype password |

**5 GitHub token**

`GITHUB_TOKEN` is automatically provided by GitHub Actions, used by JReleaser for GitHub releases.

## References
- [Sonatype Guide](https://central.sonatype.org/publish/publish-portal-maven/)
- [Demo Release](https://central.sonatype.org/publish/publish-portal-maven/)
