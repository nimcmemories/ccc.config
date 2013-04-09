ccc.config
==========

repository to configure/build CCC. Setting patch number, applications to be installed, tailing logs of currently running build on gui. etc...


DASHBOARD :

	It has Tail window which gets frame by frame output from the file on build server where a build process output is redirected 
	Ex : build.sh > /tmp/build.log 
	On dashboard on user request a window is refreshed and the content of build.log will be fetched.

BRANCH LIST: 

	List to show the branches are available from where a build can be initiated. Some basic requirements to list a branch is it should have specific directory or file so it could be assumed that from this branch a particular thing could be made.
