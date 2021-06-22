package org.recap;

/**
 * Created by akulak on 27/2/17.
 */
public class ScsbConstants {


    public static final String PERMISSION_MAP = "permissionsMap";

    public static final String USER_AUTHENTICATION = "isAuthenticated";

    public static final String USER_ID = "id";

    public static final String USER_INSTITUTION = "userInstitution";

    public static final String REQUEST_PRIVILEGE = "isRequestAllowed";

    public static final String REQUEST_ALL_PRIVILEGE = "isRequestAllAllowed";

    public static final String REQUEST_ITEM_PRIVILEGE = "isRequestItemAllowed";

    public static final String COLLECTION_PRIVILEGE = "isCollectionAllowed";

    public static final String REPORTS_PRIVILEGE = "isReportAllowed";

    public static final String SEARCH_PRIVILEGE = "isSearchAllowed";

    public static final String USER_ROLE_PRIVILEGE = "isUserRoleAllowed";

    public static final String BARCODE_RESTRICTED_PRIVILEGE = "isBarcodeRestricted";

    public static final String DEACCESSION_PRIVILEGE = "isDeaccessionAllowed";

    public static final String SUPER_ADMIN_USER = "isSuperAdmin";
    public static final String USER_ADMINISTRATOR = "isUserAdministrator";
    public static final String SUPER_ADMIN_ROLE = "Super Admin";
    public static final String USER_ADMINISTRATOR_ROLE = "User Administrator";
    public static final String REPOSITORY_ROLE = "Repository";

    public static final String REPOSITORY = "isRepository";

    public static final String ROLE_ID = "roleId";

    public static final int REQUEST_PLACE_ID = 4;

    public static final int EDIT_CGD_ID = 2;

    public static final String USER_AUTH_ERRORMSG = "authErrorMsg";

    //Permission Names
    public static final String CREATE_USER = "Create User";
    public static final String WRITE_GCD = "Write/Edit CGD";
    public static final String DEACCESSION = "Deaccession";
    public static final String REQUEST_PLACE = "Place requests for own institution's items and Shared/Open items of other institution";
    public static final String REQUEST_PLACE_ALL = "Place all requests";
    public static final String REQUEST_CANCEL = "Cancel requests";
    public static final String VIEW_PRINT_REPORTS = "View and print reports";
    public static final String SCSB_SEARCH_EXPORT = "Search";
    public static final String BARCODE_RESTRICTED = "Search (barcode number masked)";
    public static final String REQUEST_ITEMS = "Request Items";
    public static final String MONITORING_PERMISSION_NAME = "View Monitoring";
    public static final String LOGGING_PERMISSION_NAME = "View Logging";
    public static final String DATAEXPORT_PERMISSION_NAME = "Data Export";
    public static final String MONITORING = "isMonitoring";
    public static final String LOGGING = "isLogging";
    public static final String DATA_EXPORT = "isDataExport";
    public static final String REQUEST_CANCEL_ALL = "Cancel all requests";
    public static final String TOKEN_SPLITER = ":";
    public static final String USER_NAME = "userName";
    public static final String ERROR_AUTHENTICATION_FAILED = "SCSB authentication failed. Please try again.";
    public static final String ERROR_USER_TOKEN_EMPTY = "User Name Password token is empty";
    public static final String ERROR_USER_TOKEN_VALIDATION_FAILED = "User Name Password token validation fails";
    public static final String ERROR_USER_NOT_AVAILABLE = "User is not available in database";
    public static final String ERROR_SUBJECT_AUTHENTICATION_FAILED = "Subject Authentication Failed";
    public static final String ERROR_MESSAGE_USER_NOT_AVAILABLE = "User is not available in SCSB system. Please contact the administrator or send an email to <br/><a href=\"mailto:{0}\">{1}</a>";
    public static final String EXCEPTION_IN_AUTHENTICATION = "Exception occurred in authentication : ";

    public static final String BULK_REQUEST_PRIVILEGE = "isBulkRequestAllowed";
    public static final String BULK_REQUEST = "Bulk Request";

    public static final String RESUBMIT_REQUEST_PRIVILEGE = "isReSubmitRequestAllowed";
    public static final String RESUBMIT_REQUEST = "ReSubmit Request";
    public static final String MONITORING_REQUEST = "View Monitoring";
    public static final String LOGGING_REQUEST = "View Logging";
    public static final String DATAEXPORT_REQUEST = "Data Export";

}
