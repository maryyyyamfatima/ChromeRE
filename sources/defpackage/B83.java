package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public enum B83 implements InterfaceC0467Dp1 {
    g("UNKNOWN_SUB_USER_ACTION"),
    h("SUGGESTIONS_SHOWN"),
    i("CLICK_TO_SUGGESTIONS_SHOWN"),
    j("INTENT_RECEIVED_TO_SUGGESTIONS_SHOWN"),
    k("CLICK_TO_CACHED_SUGGESTIONS_SHOWN"),
    l("INTENT_RECEIVED_TO_CACHED_SUGGESTIONS_SHOWN"),
    m("CLICK_TO_FEELING_LUCKY_SHOWN"),
    n("INTENT_RECEIVED_TO_FEELING_LUCKY_SHOWN"),
    o("CLICK_TO_PREV_SESSION_ARTICLE_SHOWN"),
    p("INTENT_RECEIVED_TO_PREV_SESSION_ARTICLE_SHOWN"),
    q("CLICK_TO_COMPOSE_FEEDBACK_SHOWN"),
    r("SEARCH_RESULTS_SHOWN"),
    s("SEARCH_ONE_BOX"),
    t("AUTO_COMPLETE_SUGGESTIONS_REQUEST"),
    u("HELP_ARTICLE_SHOWN"),
    v("CACHED_ARTICLE_SHOWN"),
    w("CONTACT_FORM_SHOWN"),
    x("SURVEY_FORM_SHOWN"),
    y("ESCALATION_OPTIONS_REQUEST"),
    z("CONFIGURATIONS_REQUEST"),
    A("RECOMMENDATIONS_REQUEST"),
    B("CHAT_REQUEST"),
    C("CANCEL_CHAT_REQUEST"),
    D("C2C_REQUEST"),
    E("VIDEO_CALL_REQUEST"),
    F("CANCEL_VIDEO_CALL_REQUEST"),
    G("SUBMIT_EMAIL_REQUEST"),
    H("REALTIME_SUPPORT_STATUS_REQUEST"),
    I("AUTO_DECLINE_SCREENSHARE_REQUEST"),
    f11436J("REPORT_BATCH_METRICS_REQUEST"),
    K("OAUTH_CONTENT_SUPPORT_REQUEST"),
    L("OFFLINE_HELP_CONTENT_REQUEST"),
    M("ASYNC_FEEDBACK_PSBD"),
    N("ASYNC_FEEDBACK_PSD"),
    O("ASYNC_HELP_PSD"),
    P("SYNC_HELP_PSD"),
    Q("FEEDBACK_SUGGESTION_REQUEST"),
    R("FEEDBACK_SUBMISSION_REQUEST"),
    S("SMART_JOURNEY_CONTACT_US_REQUEST"),
    T("SMART_JOURNEY_COMMUNITY_REQUEST"),
    U("RECOMMENDATION_REQUEST_FAILED"),
    V("JOIN_CHAT_CONVERSATION_REQUEST"),
    W("LEAVE_CHAT_CONVERSATION_REQUEST"),
    X("SEND_CHAT_MESSAGE_REQUEST"),
    Y("LIST_CONVERSATION_EVENTS_REQUEST"),
    Z("UPDATE_TYPING_STATUS_REQUEST"),
    a0("REQUEST_CHAT_TRANSCRIPT_EMAIL_REQUEST"),
    b0("REQUEST_CHAT_TRANSCRIPT_EMAIL_CARD_SHOWN"),
    c0("EARLY_SUGGESTIONS_FAILED"),
    d0("EARLY_SUGGESTIONS_SUCCESS"),
    e0("HTML_LOADED_FROM_START"),
    f0("HTML_LOADED_FROM_START_NEW_API"),
    g0("UI_READY_FROM_START"),
    h0("UI_READY_FROM_START_NEW_API"),
    i0("LOADJS_START_TIME"),
    j0("LOADJS_CONNECT_TIME"),
    k0("LOADJS_REQUEST_TIME"),
    l0("LOADJS_RESPONSE_TIME"),
    m0("LOADJS_PARSE_TIME"),
    n0("LOADJS_EXECUTE_TIME"),
    o0("ACTION_REQUEST"),
    p0("ACTION_SUCCESS"),
    q0("ACTION_ERROR"),
    r0("CLOSE_BUTTON_CLICKED"),
    s0("BACK_BUTTON_CLICKED"),
    t0("SWITCH_TO_APP_BUTTON_CLICKED"),
    u0("CLOSED_BY_HELP_ACTION"),
    v0("MODAL_BACKGROUND_TAPPED"),
    w0("MODAL_BACKGROUND_SWIPED"),
    x0("PIP_SHOWN"),
    y0("PIP_CLICKED"),
    z0("PIP_SNAPPED_VERTICALLY"),
    A0("PIP_DISMISSED"),
    B0("CHROME_IOS"),
    C0("SAFARI_IOS"),
    D0("NOT_GOOGLE_EXPERIENCE_DEVICE"),
    E0("ERROR_GETTING_APPLICATION_INFO"),
    F0("NOT_SYSTEM_APP"),
    G0("NOT_WHITELISTED"),
    H0("HELP_ACTION_COMPLETED"),
    I0("HELP_ACTION_ABANDONED"),
    J0("FEEDBACK_ANNOTATOR_READY"),
    K0("FEEDBACK_SNAPSHOT_DISPLAYED"),
    L0("POOL_UNAVAILBLE"),
    M0("RENDERED_IN_PORTRAIT_MODE"),
    N0("RENDERED_IN_LANDSCAPE_MODE"),
    O0("MINIMIZE_VIEW"),
    P0("MAXIMIZE_VIEW"),
    Q0("CASES_SEARCH_RESULTS_ALL"),
    R0("CASES_SEARCH_RESULTS_CRS"),
    S0("CASES_SEARCH_RESULTS_INTERNAL"),
    T0("CASES_SEARCH_RESULTS_EXTERNAL"),
    U0("CASES_SEARCH_RESULTS_WORKFLOWS"),
    V0("CASES_SUGGEST_RECENT"),
    W0("CASES_SUGGEST_FAVORITE"),
    X0("CASES_SUGGEST_SUGGESTION"),
    Y0("WHILE_IN_QUEUE"),
    Z0("WHILE_IN_CONVERSATION"),
    a1("INVITATION_SHOWN"),
    b1("INVITATION_ACCEPTED"),
    c1("INVITATION_DECLINED"),
    d1("INVITATION_RECEIVED"),
    e1("INVITATION_ERROR"),
    f1("ICE_GATHERING_COMPLETE"),
    g1("ICE_CONNECTED"),
    h1("ICE_DISCONNECTED"),
    i1("ICE_DISCONNECTED_FOR_TOO_LONG"),
    j1("ICE_CLOSED"),
    k1("ICE_CONNECTION_TIMEOUT"),
    l1("FAILED_TO_SEND_P2P_MSG"),
    m1("FAILED_TO_GET_AGENT_SDP"),
    n1("FAILED_TO_SET_SDP"),
    o1("FAILED_TO_CREATE_USER_SDP"),
    p1("FAILED_TO_SEND_USER_SDP"),
    q1("FAILED_TO_GET_ICE_SERVERS"),
    r1("FAILED_TO_SEND_DECLINE"),
    s1("BATTERY_LEVEL"),
    t1("PEER_CONNECTION_STATS_COLLECTED"),
    u1("USER_PROMPTED_TO_UPDATE_APP"),
    v1("USER_VISITED_PLAY_STORE_WEB_TO_UPDATE"),
    w1("USER_VISITED_PLAY_STORE_APP_TO_UPDATE"),
    x1("FAILED_TO_ADD_MEDIA_STREAM"),
    y1("FAILED_TO_CREATE_PEER_CONNECTION_FACTORY"),
    z1("RECEIVED_BINARY_P2P_MSG"),
    A1("RECEIVED_INVALID_JSON_P2P_MSG"),
    B1("RECEIVED_UNRECOGNIZED_P2P_MSG_TYPE"),
    C1("CAPTURE_PERMISSION_ASKED"),
    D1("CAPTURE_PERMISSION_GRANTED"),
    E1("CAPTURE_PERMISSION_DECLINED"),
    F1("CAPTURE_PERMISSION_REVOKED"),
    G1("USER_PAUSED_BY_FAB"),
    H1("USER_RESUMED_BY_FAB"),
    I1("USER_ENDED_BY_FAB"),
    J1("USER_PAUSED_BY_NOTIFICATION"),
    K1("USER_RESUMED_BY_NOTIFICATION"),
    L1("USER_ENDED_BY_NOTIFICATION"),
    M1("DEVICE_ORIENTATION_LANDSCAPE"),
    N1("DEVICE_ORIENTATION_PORTRAIT"),
    O1("AGENT_ENDED"),
    P1("AGENT_ANNOTATION_RIPPLE"),
    Q1("AGENT_SDP_SET_SUCCESS"),
    R1("ICE_SERVERS_RECEIVED"),
    S1("VIDEO_STREAM_ADDED"),
    T1("ICE_GATHERING_TIMEDOUT_WITH_NO_CANDIDATES"),
    U1("ICE_GATHERING_TIMEDOUT"),
    V1("ICE_GATHERING_REACHED_MIN_CANDIDATES"),
    W1("SESSION_STATS_COLLECTED"),
    X1("ICE_RECONNECTED"),
    Y1("INVITATION_NOT_FOUND"),
    Z1("REPORT_HELPRTC_PHENOTYPE_EXPERIMENT_TOKEN"),
    a2("AGENT_SDP_RECEIVED"),
    b2("USER_SDP_DETERMINED"),
    c2("EXTRA_USER_ICE_CANDIDATE_FOUND"),
    d2("FAILED_TO_SEND_USER_EXTRA_CANDIDATE"),
    e2("CASES_INVITATION_NOT_FOUND"),
    f2("CASES_SERVER_DEADLINE_EXCEEDED"),
    g2("OTHER_CASES_SERVER_ERROR"),
    h2("SCREENSHARE_VERSION_TOO_LOW"),
    i2("SCREENSHARE_RTC_NOT_AVAILABLE"),
    j2("SCREENSHARE_NO_VOICE_AND_DATA"),
    k2("SCREENSHARE_BACKGROUND_DATA_OFF"),
    l2("SCREENSHARE_ACCESSIBILITY_MODE_ON"),
    m2("SCREENSHARE_BATTERY_LOW"),
    n2("SCREENSHARE_SIGNAL_STRENGTH_LOW"),
    o2("SCREENSHARE_NOT_ON_WIFI"),
    p2("SCREENSHARE_ON_2G_NETWORK"),
    q2("SCREENSHARE_GMSCORE_TOO_OLD"),
    r2("REQUESTING_HELP_RTC_INSTALLATION"),
    s2("REQUESTING_HELP_RTC_UPDATE"),
    t2("HELP_RTC_NOT_INSTALLABLE"),
    u2("HELP_RTC_PACKAGE_ADDED"),
    v2("HELP_RTC_PACKAGE_CHANGED"),
    w2("HELP_RTC_INSTALLATION_NOT_COMPLETED"),
    x2("HELP_RTC_UPDATE_NOT_COMPLETED"),
    y2("RESPONSE_TO_NATIVE_SURVEY"),
    z2("SURVEY_SHOWN_AFTER_USER_ENDED_CHAT"),
    A2("SURVEY_SHOWN_AFTER_AGENT_ENDED_CHAT"),
    B2("EXCEPTION_WHILE_COLLECTING"),
    C2("EXCEPTION_WHILE_READING"),
    D2("TIMEOUT"),
    E2("NULL_API_CLIENT"),
    F2("INVALID_ID"),
    G2("ACCOUNT_SUCCESSFULLY_CHANGED"),
    H2("INVALID_ACCOUNT"),
    I2("QUERY_DEVICE_DATA_FOR_USER"),
    J2("CASES_RESOLUTION_CARD_MAXIMIZED"),
    K2("MULTIPLE_ACCOUNTS"),
    L2("CHAT_QUEUE_NOTIFICATION"),
    M2("CHAT_MESSAGE_NOTIFICATION"),
    N2("CHAT_TYPING_NOTIFICATION"),
    O2("OCARINA_REDIRECT_FAILED_MIN_VERSION"),
    P2("OCARINA_REDIRECT_FAILED_NOT_INSTALLED"),
    Q2("OCARINA_REDIRECT_FAILED_UNRESOLVED_MODULE"),
    R2("OCARINA_REDIRECT_FAILED_CONVERT_TO_BYTES"),
    S2("OCARINA_REDIRECT_FAILED_WRITE_BYTES"),
    T2("DARK_THEME"),
    U2("LIGHT_THEME"),
    V2("SYSTEM_DEFAULT_THEME"),
    W2("DYNAMIC_COLOR"),
    X2("NEED_MORE_HELP_IN_HOME_PAGE"),
    Y2("NEED_MORE_HELP_IN_SEARCH_RESULTS"),
    Z2("SJ_CONTACT_US_STEP_1"),
    a3("SJ_CONTACT_US_STEP_3"),
    b3("SJ_CONTACT_US_CHANNEL"),
    c3("SUB_ITEM_COMPANY_CLICKED"),
    d3("SUB_ITEM_ACCOUNT_CLICKED"),
    e3("SUB_ITEM_CONTACT_CLICKED"),
    f3("INITIAL_CONTACT_CARD_PLACEMENT_BOTTOM"),
    g3("INITIAL_CONTACT_CARD_PLACEMENT_TOP"),
    h3("SMART_REPLY_SHOWN_IN_CONVERSATION"),
    i3("SMART_REPLY_CLICKED_IN_CONVERSATION"),
    j3("SMART_REPLY_SHOWN_IN_NOTIFICATION"),
    k3("SMART_REPLY_CLICKED_IN_NOTIFICATION"),
    l3("YOUTUBE_VIDEO_METADATA_IN_SEARCH_RESULTS");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + B83.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    B83(String str) {
        this.a = r2;
    }
}
