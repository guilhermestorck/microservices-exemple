package conf

enum class DatabaseTables(
    val tableName: String
) {
    INSURANCE_PLANS_INSURANCE_COVERAGE_ITEMS("INSURANCE_PLANS_INSURANCE_COVERAGE_ITEMS"),
    INSURANCE_COVERAGE_ITEMS("INSURANCE_COVERAGE_ITEMS"),
    INSURANCE_PLANS("INSURANCE_PLANS")
}