param(
    [string]$ProjectDir = ".",
    [string]$Name,
    [string]$Version
)

Write-Output "JAVA_HOME :$ENV:JAVA_HOME"

./java/build-project.ps1 -RepoName "location-java-test" -ProjectDir $ProjectDir -Name $Name -Version $Version

exit $LASTEXITCODE