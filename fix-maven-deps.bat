@echo off
echo ==============================================
echo  Maven Dependency Fix Script + IntelliJ Launch
echo ==============================================
echo.

:: Change this to your IntelliJ IDEA executable path
set IDEA_PATH="C:\Program Files\JetBrains\IntelliJ IDEA 2024.1\bin\idea64.exe"

:: Navigate to project directory
cd /d "%~dp0"

echo Step 1: Cleaning project...
mvn clean

echo Step 2: Purging local repository for project...
mvn dependency:purge-local-repository -DreResolve=true

echo Step 3: Forcing Maven to update all dependencies...
mvn clean install -U

echo.
echo Step 4: Launching IntelliJ IDEA...
start "" %idea64.exe% "%cd%"

echo ==============================================
echo  All dependencies refreshed & IntelliJ opened!
echo ==============================================
pause

