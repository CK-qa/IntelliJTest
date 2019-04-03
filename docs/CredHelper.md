Preconditions:
File | Settings | Appearance & Behavior | System Settings | Passwords
Set do not store passwords

Clone project via https protocol.

There are several tools that needs to be tested on several OSs.

### **Windows:**
- **Git credential helper:**
    - default: default is not to cache at all. Every connection will prompt you for your username and password.
    - cache: _`git config --global credential.helper cache`_. The “cache” mode keeps credentials in memory for a certain period of time. None of the passwords are ever stored on disk, and they are purged from the cache after 15 minutes.
    - store: _`git config --global credential.helper 'store --file ~/.my-credentials'`_. The “store” mode saves the credentials to a plain-text file on disk, and they never expire. Until Git host password will be changed.
- **Git Credential Manager for Windows:**


Test 2FA
 - install 2fa application on your phone and pair it with your GitHub account 
- kk