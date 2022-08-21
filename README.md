# Setup a Git Repo

## First steps

```bash
# for all new laptops
$ git config --global user.name "Ravi Tripathi"
$ git config --global user.email ravi@example.com
# show current config
$ git config --list
```

## Adding files to Git Repository


```bash
$ git add MergeArray.java
# above command adds the file in your directory to Git's own repository tracking system(staging area)
# analogy: a cameraman has asked people to pose for a picture

# now lets take a look at what has adding that file does to your directory structure
ravi@random:~/Merge$ git status
On branch master
#### ^ this tells which branch you are on
#### Analogy: Think of branch in git as workstreams, it's usually having different code-features or bugfixes which are being independently worked upon by same or different people

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
#### ^ this tells you how to kick out some files from the staging area(the podium where people are getting clicked)
	new file:   MergeArray.java
#### ^ this tells that a new file has been added to git repo(a git repo is not the same as Github!)
#### you can see which people(files) are waiting to get clicked(saved to Git)

Untracked files:
#### ^ people/files you can add to your podium
  (use "git add <file>..." to include in what will be committed)
	MergeArray.class
	README.md


## Commit-ing your change
ravi@random:~/Merge$ git commit -m 'add code for merging two arrays'
# analogy: actually a photo is clicked
# above command actually saves your change to the Git Repo
[master (root-commit) f51131e] 'add code for merging two arrays'
 1 file changed, 47 insertions(+)
 create mode 100644 MergeArray.java


ravi@random:~/Merge$ git log
# to track the changs done to your codebase/photo-reel in an Post
# analogy: you can track all the changes done to your profile(could include all public posts by you or your collaborators)
# think of it like a book index or a history timeline, you can look at any change with a greater detail if required

$ git push origin main
# above command pushes your code changes to a central hosted repository like GitHub/GitLab so that your changes can be seen by your collaborators
# analogy: upload to photo to Instagram

# but wait, which Instagram account??? Do you have the requisite authentication/authorization for the same?? To set-it-up you need to create a Repo on a code-hosting site like GitHub/GitLab e.g. https://github.com/new and choose a name for it.
# this cannot be done from Terminal(will cover it later)
# github does share instructions on how to push changes from your local repository on your laptop to GitHub
$ git remote add origin git@github.com:tripathiravi68/Merge.git
# ^ this sets a remote location for your git repo
# analogy: Instagram handle for your code
# now if you run git push origin <BRANCH_NAME> your code will get pushed after password-authentication
# NOTE: Don't add HTTP urls as GitHub doesn't support Password Authentication these days
$ git remote -v
# ^ you can take a look at which remotes(Instagram accounts) are configured for this codechange(Instagram photo)
ravi@random:~/Merge$ git remote -v
origin	git@github.com:tripathiravi68/Merge.git (fetch)
origin	git@github.com:tripathiravi68/Merge.git (push)
ravi@random:~/Merge$ 

```

# Creating SSH-keys to authenticate self to GitHub

1. Go to https://github.com/settings/keys
2. Go to terminal and run `ssh-keygen`, hint: press enter to accept defaults
3. copy the contents of the id_rsa.pub file and paste it in https://github.com/settings/ssh/new and click `Add SSH Key`
4. go to terminal and run `ssh -T git@github.com` and type `yes` when prompted
```bash
ravi@random:~$ ssh -T git@github.com
The authenticity of host 'github.com (20.207.73.82)' can't be established.
ECDSA key fingerprint is SHA256:p2QAMXNIC1TJYWeIOttrVc98/R1BUFWu3/LiyKgUfQM.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added 'github.com,20.207.73.82' (ECDSA) to the list of known hosts.
Hi tripathiravi68! You've successfully authenticated, but GitHub does not provide shell access.
```
5. Now you can push to GitHub seamlessly if your remote is using SSH-URLs which look like `git@github.com:$GITHUB_USERNAME/$GITHUB_REPO_NAME`
