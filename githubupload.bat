@echo off
cd "C:\Users\shwet\eclipse-workspace\SeleniumAutomationFramework"
git add .
set /p commitm="Commit Msg: "
git commit -m %commitm%
git push origin