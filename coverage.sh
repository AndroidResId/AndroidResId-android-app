./gradlew clean assemble;
./gradlew jacocoTestReport;
./gradlew jacocoRootReport coveralls;
open ./app/build/reports/jacocoTestReport