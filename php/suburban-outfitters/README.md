## To-Do
__Update 3/7:__ Need to add a product.php page for viewing individual product items (and add to cart, etc)

Basic HTML pages for:

1. Account
2. Products
    * PHP for filtering products by category
    * __Update 3/7__: Added filler dynamic content to demo basic filtering by category
3. Orders
    * Actions for returning items / tracking shipping status
    * __Update 3/7__: Added basic dynamic content to match wireframe. Still need shipping and product.php pages to help demo function.
4. Shipping info
5. Inventory
6. Cart
7. Checkout

---

**Notes from webinar 3/4:**

* For midterm project status, static pages are fine (HTML/CSS as PHP fils only). **No need for Bootstrap unless we want to**
* No DB data needed or the DB doesn't need to be built at this point. Use static pages to force actions we want as examples
* Pages can be super basic looking, it's all about functionality over form.
* ERD will need to have 10 entity types. Professor indicates this is because of variety of project scopes that not every project fits all

---

# Git cheatsheet
**Windows:** Highly recommend downloading [Git for Windows](https://gitforwindows.org/) to allow for source control locally -- allows for testing and local updating on your own machine.

**Mac/Linux:** Git should be installed by default.

## Cloning the repository
1. Go to the source section of the repository
2. Click "Clone"
3. On your local computer, navigate in terminal (Git for Windows or Terminal depending on system) to the location you want to store the repository	
	* Recommendation: Put it in the WAMP/MAMP **www** folder
3. Copy/paste the clone link into your terminal
4. Provide your BitBucket credentials when prompted

## Pulling latest versions
Make sure before developing to make sure your local files are using the latest developed files for the branch you're working on:

`git pull origin [branch]` 

**NOTE: Before creating a new branch, make sure to pull the latest version of `master` **

## Checking out a branch
Branches are useful for developing features singularly and to avoid too many people making updates at once that might conflict with one another. 

1. `git checkout -b [branch_name]`
	* `-b` is used to create a new branch if it doesn't already exist. Omit it if you're checking out an existing branch

## Committing a change

1. Use `git status` to see which files have been modified in your development
2. For files that you want to publish back to the repository, add them to the commit by using `git add <filename>`
3. Once all files are added, create the commit by using `git commit -m <short_message_describing_commit>`
4. Push the change to the repository with `git push origin <branch_name>`

## More Git resources
https://www.atlassian.com/git/tutorials/atlassian-git-cheatsheet

---

**Edit a file, create a new file, and clone from Bitbucket in under 2 minutes**

When you're done, you can delete the content in this README and update the file with details for others getting started with your repository.

*We recommend that you open this README in another tab as you perform the tasks below. You can [watch our video](https://youtu.be/0ocf7u76WSo) for a full demo of all the steps in this tutorial. Open the video in a new tab to avoid leaving Bitbucket.*

---

## Edit a file

You’ll start by editing this README file to learn how to edit a file in Bitbucket.

1. Click **Source** on the left side.
2. Click the README.md link from the list of files.
3. Click the **Edit** button.
4. Delete the following text: *Delete this line to make a change to the README from Bitbucket.*
5. After making your change, click **Commit** and then **Commit** again in the dialog. The commit page will open and you’ll see the change you just made.
6. Go back to the **Source** page.

---

## Create a file

Next, you’ll add a new file to this repository.

1. Click the **New file** button at the top of the **Source** page.
2. Give the file a filename of **contributors.txt**.
3. Enter your name in the empty file space.
4. Click **Commit** and then **Commit** again in the dialog.
5. Go back to the **Source** page.

Before you move on, go ahead and explore the repository. You've already seen the **Source** page, but check out the **Commits**, **Branches**, and **Settings** pages.

---

## Clone a repository

Use these steps to clone from SourceTree, our client for using the repository command-line free. Cloning allows you to work on your files locally. If you don't yet have SourceTree, [download and install first](https://www.sourcetreeapp.com/). If you prefer to clone from the command line, see [Clone a repository](https://confluence.atlassian.com/x/4whODQ).

1. You’ll see the clone button under the **Source** heading. Click that button.
2. Now click **Check out in SourceTree**. You may need to create a SourceTree account or log in.
3. When you see the **Clone New** dialog in SourceTree, update the destination path and name if you’d like to and then click **Clone**.
4. Open the directory you just created to see your repository’s files.

Now that you're more familiar with your Bitbucket repository, go ahead and add a new file locally. You can [push your change back to Bitbucket with SourceTree](https://confluence.atlassian.com/x/iqyBMg), or you can [add, commit,](https://confluence.atlassian.com/x/8QhODQ) and [push from the command line](https://confluence.atlassian.com/x/NQ0zDQ).