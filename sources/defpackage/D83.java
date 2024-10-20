package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public enum D83 implements InterfaceC0467Dp1 {
    g("UNKNOWN_USER_ACTION"),
    h("DISMISSED"),
    i("RECOMMENDATION_OPENED"),
    j("RECOMMENDATION_HELPFUL"),
    k("RECOMMENDATION_NOT_HELPFUL"),
    l("CONTACT_US"),
    m("SEND_FEEDBACK"),
    n("SEND_FEEDBACK_REQUESTED"),
    o("SEND_FEEDBACK_TO_GOOGLE_REQUESTED"),
    p("MORE_RESULTS"),
    q("BACK_BUTTON"),
    r("SEND_BUTTON"),
    s("HELP_CENTER"),
    t("COMMUNITY"),
    u("SHOWN_SUGGESTIONS"),
    v("SHOWN_SEARCH_RESULTS"),
    w("SHOWN_BROWSE_ALL_ARTICLES"),
    x("SUGGESTION_CLICKED"),
    y("SEARCH_RESULTS_CLICKED"),
    z("CASES_RESOLUTION_SEARCH_OPENED"),
    A("RECENT_ARTICLE_CLICKED"),
    B("ARTICLE_HELP_LINK_CLICKED"),
    C("BROWSE_ALL_ARTICLES_CLICKED"),
    D("ND4C_REQUESTED"),
    E("SEARCH_INTENT_SHOWN"),
    F("SEARCH_INTENT_CLICKED"),
    G("SEARCH_RELATED_QUESTION_RESULT_EXPANDED"),
    H("SEARCH_RELATED_QUESTION_RESULT_COLLAPSED"),
    I("SEARCH_RELATED_QUESTION_RESULT_CLICKED"),
    f11439J("DIFM_CLICKED"),
    K("EXPLORE_HELP"),
    L("FORUM_VISITED"),
    M("OPENED_TO_ARTICLE"),
    N("AUTOCOMPLETE_SEARCH_QUERY"),
    O("PROMOTED_CONTENT_SHOWN"),
    P("PROMOTED_CONTENT_CLICKED"),
    Q("REPORT_PHENOTYPE_EXPERIMENT_TOKEN"),
    R("NO_SUGGESTIONS_SHOWN"),
    S("BUNDLED_SUGGESTIONS_SHOWN"),
    T("BUNDLED_SUGGESTION_CLICKED"),
    U("BUNDLED_ARTICLE_RENDERED"),
    V("OPENED_TO_BUNDLED_ARTICLE"),
    W("NEW_CHAT_REQUEST"),
    X("ESCALATION_STATUS_UPDATE"),
    Y("FETCH_FROM_NETWORK_FAILED"),
    Z("AUTOCOMPLETE_RESULTS_CLICKED"),
    a0("CANCEL_ESCALATION_REQUEST"),
    b0("CSAT_SURVEY_SHOWN"),
    c0("CSAT_SURVEY_CLICKED"),
    d0("CSAT_SURVEY_COMPLETED"),
    e0("CSAT_SURVEY_ABANDONED"),
    f0("CHAT_ELIGIBLE_BUT_HANGOUTS_NOT_SUPPORTED"),
    g0("VIDEO_ELIGIBLE_BUT_HANGOUTS_NOT_SUPPORTED"),
    h0("VIDEO_ELIGIBLE_BUT_VIDEO_NOT_SUPPORTED"),
    i0("CHAT_ISSUE_CLASSIFIER_FORM_OPENED"),
    j0("VIDEO_ISSUE_CLASSIFIER_FORM_OPENED"),
    k0("CHAT_ELIGIBLE_BUT_CHAT_NOT_SUPPORTED"),
    l0("SHOWN_CONTACT_US"),
    m0("BRANDED_CONTACT_US_FRAGMENT_SHOWN"),
    n0("SEND_FEEDBACK_BUTTON_SHOWN"),
    o0("RENDERING_API_C2C_FORM_REQUESTED"),
    p0("SMART_JOURNEY_FORM_SUBMITTED"),
    q0("SMART_JOURNEY_CARD_CLICKED"),
    r0("SMART_JOURNEY_CARD_DISPLAYED"),
    s0("SMART_JOURNEY_CONTINUE_CHAT_CARD_CLICKED"),
    t0("SMART_JOURNEY_CONTINUE_CHAT_CARD_DISPLAYED"),
    u0("SMART_JOURNEY_DEEP_LINK_CLICKED"),
    v0("OPENED_TO_SJ_CONTACT_US"),
    w0("COMMUNITY_CARD_CLICKED"),
    x0("COMMUNITY_CARD_DISPLAYED"),
    y0("CONTACT_US_CLICKED"),
    z0("AUTOCOMPLETE_CLICK_IMPRESSIONS"),
    A0("SHOWN_AUTOCOMPLETE"),
    B0("SESSION_RESUMED"),
    C0("LATENCY_MEASURED"),
    D0("ARTICLE_LOADED"),
    E0("ARTICLE_RENDERED"),
    F0("CUF_RENDERED"),
    G0("PANEL_DRAGGED"),
    H0("PANEL_OPENED"),
    I0("INAPP_SCREENSHOT_RENDERED"),
    J0("RESOURCE_NOT_ALLOWED"),
    K0("CHAT_ELIGIBLE_BUT_REALTIME_SUPPORT_UNAVAILABLE"),
    L0("VIDEO_ELIGIBLE_BUT_REALTIME_SUPPORT_UNAVAILABLE"),
    M0("OPENED_TO_CONTACT_OPTION"),
    N0("OPEN_TO_CONTACT_OPTION_REQUESTED"),
    O0("PIP_ACTION"),
    P0("CUSTOM_FEEDBACK_OPENED"),
    Q0("NONARTICLE_HELP_LINK_CLICKED"),
    R0("THIRD_PARTY_APP_HELP_INVOCATION"),
    S0("THIRD_PARTY_APP_HELP_LAUNCHED"),
    T0("THIRD_PARTY_APP_HELP_INVOCATION_ERROR"),
    U0("HELP_ACTION_CONVERSION"),
    V0("SNAPSHOT_CAPTURED"),
    W0("LOGIN_STEP_SHOWN"),
    X0("LOGIN_CLICKED"),
    Y0("CLIENT_START_FEEDBACK"),
    Z0("EMAIL_SELECTOR_SHOWN"),
    a1("EMAIL_DECLINED"),
    b1("EMAIL_CHANGED"),
    c1("EMAIL_ADDED"),
    d1("DESCRIBE_STEP_SHOWN"),
    e1("ENTERED_DESCRIPTION"),
    f1("VIEWING_SCREENSHOT"),
    g1("ANNOTATE_STEP_SHOWN"),
    h1("HIGHLIGHTED_SCREENSHOT"),
    i1("BLACKED_OUT_SCREENSHOT"),
    j1("REVIEW_STEP_SHOWN"),
    k1("CREATE_SCREENSHOT_RENDERER"),
    l1("RENDER_SCREENSHOT"),
    m1("SCREENSHOT_ATTACHMENT_SHOWN"),
    n1("DECLINED_SCREENSHOT"),
    o1("SYSTEM_LOGS_ATTACHMENT_SHOWN"),
    p1("DECLINED_SYSTEM_LOGS"),
    q1("VIEWING_SYSTEM_LOGS"),
    r1("VIEWING_SYSTEM_INFO"),
    s1("VIEWING_LEGAL_TEXT"),
    t1("OPENED_LEGAL_PAGE"),
    u1("OPENED_PRIVACY_POLICY"),
    v1("OPENED_TERMS_OF_SERVICE"),
    w1("SUBMIT"),
    x1("SUBMIT_WITH_RETRY"),
    y1("FEEDBACK_JUNK_DIALOG_SHOWN"),
    z1("FEEDBACK_JUNK_ADD_MORE_TAPPED"),
    A1("FEEDBACK_JUNK_SEND_ANYWAY_TAPPED"),
    B1("FEEDBACK_JUNK_DESCRIPTION_MODIFIED"),
    C1("THANK_YOU_STEP_SHOWN"),
    D1("SHOWN_FEEDBACK_SUGGESTION"),
    E1("FEEDBACK_SUGGESTION_CLICKED"),
    F1("FEEDBACK_SUGGESTION_CLOSED"),
    G1("FEEDBACK_UPGRADE_DIALOG_SHOWN"),
    H1("FEEDBACK_UPGRADE_DIALOG_DECLINED"),
    I1("FEEDBACK_UPGRADE_DIALOG_BACK_PRESSED"),
    J1("FEEDBACK_UPGRADE_DIALOG_PLAY_STORE_INTENT_LAUNCHED"),
    K1("FEEDBACK_UPGRADE_DIALOG_PLAY_STORE_WEB_LAUNCHED"),
    L1("FEEDBACK_UPGRADE_DIALOG_PLAY_STORE_FAILED"),
    M1("FEEDBACK_MEMORY_DROPPED_ANR_STACK_TRACES"),
    N1("FEEDBACK_FAILED_TO_READ_ANR_TRACE_FILE"),
    O1("CHAT_CONVERSATION_ACTION"),
    P1("USER_ACCEPT_SUPPORT_TIMED_OUT"),
    Q1("SHOWN_ALERT_DIALOG"),
    R1("ALERT_DIALOG_BUTTON_CLICKED"),
    S1("CHAT_VIEW_TIME"),
    T1("CHAT_HELP_ACTION_SHOWN"),
    U1("CHAT_HELP_ACTION_NOT_SUPPORTED"),
    V1("CHAT_HELP_ACTION_CLICKED"),
    W1("CHAT_PUSH_NOTIFICATION_RECEIVED"),
    X1("SCREENSHARE_ACTION"),
    Y1("HELP_RTC_VERSION_CHECK_ACTION"),
    Z1("SCREENSHARE_ELIGIBILITY_ISSUE"),
    a2("SCREENSHARE_ELIGIBILITY_WARNING"),
    b2("GCM_TOKEN_TIMEOUT"),
    c2("HELP_ASSISTANT_SWITCH_VIEW_MODE"),
    d2("HELP_ASSISTANT_OPENED_TO_CUSTOM_VIEW"),
    e2("ASYNC_FEEDBACK_PSBD_FAILURE"),
    f2("ASYNC_FEEDBACK_PSD_FAILURE"),
    g2("ASYNC_HELP_PSD_FAILURE"),
    h2("SYNC_HELP_PSD_FAILURE"),
    i2("DEVICE_SIGNALS_EXPORT_ACTION"),
    j2("HELP_ACCOUNT_CHANGE_ACTION"),
    k2("SIGN_IN_BUTTON_SHOWN"),
    l2("SIGN_IN_BUTTON_CLICKED"),
    m2("REQUEST_RECEIVED"),
    n2("INVALID_PHONE_NUMBER"),
    o2("APPLICATION_INFO_LINK_CLICKED"),
    p2("PSD_CHARACTER_LIMIT_EXCEEDED"),
    q2("GET_SUGGESTIONS_ACTION"),
    r2("GET_ESCALATION_OPTIONS_ACTION"),
    s2("OPEN_TO_SEARCH_RESULTS_REQUESTED"),
    t2("OPEN_TO_CONTENT_REQUESTED"),
    u2("GET_REALTIME_SUPPORT_STATUS_REQUESTED"),
    v2("TNT_FRAGMENT_CREATE_REQUESTED"),
    w2("TNT_FRAGMENT_MATERIAL2_CREATE_REQUESTED"),
    x2("SEARCH_BOX_SHOWN"),
    y2("SEARCH_INPUT_INITIATED"),
    z2("SEARCH_QUERY_SUBMITTED"),
    A2("OPENED_TO_BROWSER"),
    B2("MOBILE_DEVICE_DATA_ACTION"),
    C2("CASES_CARD_MAXIMIZED"),
    D2("CONTACT_OPTIONS_SHOW_HOURS_CLICKED"),
    E2("CONTACT_OPTIONS_HIDE_HOURS_CLICKED"),
    F2("SHOWN_ISSUE_RESOLUTION_SEARCH_RESULT"),
    G2("ISSUE_RESOLUTION_SEARCH_RESULT_CLICKED"),
    H2("GMH_DEVICE_SETTING_SWITCH_TAPPED"),
    I2("GMH_DEVICE_SETTING_MORE_OPTIONS_TAPPED"),
    J2("GMH_DEVICE_SETTING_ERROR_MESSAGE_SHOWN"),
    K2("OFFLINE_PREFETCH_SUGGESTION_CLICKED"),
    L2("OFFLINE_PREFETCH_SUGGESTIONS_SHOWN"),
    M2("PREFETCH_OFFLINE_HELP_CONTENT"),
    N2("AUTOCOMPLETE_QUERY_SUGGESTION_ARROW_CLICKED"),
    O2("SHARE_HELP_ARTICLE_REQUESTED"),
    P2("GMH_APP_PACKAGE_NAME_OVERRIDE_REQUESTED"),
    Q2("OCARINA_REDIRECT_ATTEMPTED"),
    R2("OCARINA_GOOGLEHELP_BYTES_CONVERSION_TIME_MILLIS"),
    S2("OCARINA_GOOGLEHELP_WRITTEN_TO_DISK"),
    T2("OCARINA_LAUNCH_PREP_TIME_MILLIS"),
    U2("OCARINA_GOOGLE_HELP_NUM_BYTES"),
    V2("OCARINA_REDIRECT_TIME_MILLIS"),
    W2("OPEN_TO_SMART_JOURNEY_REQUESTED"),
    X2("THEME_USED"),
    Y2("THEME_APPLIED"),
    Z2("INITIAL_CONTACT_CARD_PLACEMENT"),
    a3("SMART_REPLY_ACTION"),
    b3("NETWORK_REQUEST_TIMED_OUT"),
    c3("NETWORK_REQUEST_FAILED"),
    d3("YOUTUBE_VIDEO_METADATA_CARD_DISPLAYED"),
    e3("YOUTUBE_VIDEO_METADATA_CARD_CLICKED"),
    f3("PROMOTED_PRODUCT_LINKS_RECEIVED"),
    g3("PROMOTED_PRODUCT_LINKS_SHOWN"),
    h3("PROMOTED_PRODUCT_LINK_OPENED"),
    i3("PROMOTED_PRODUCT_LINK_EXCEPTION_CAUGHT");

    public final int a;

    @Override // defpackage.InterfaceC0467Dp1
    public final int a() {
        return this.a;
    }

    public static D83 c(int i4) {
        switch (i4) {
            case 0:
                return g;
            case 1:
                return h;
            case 2:
                return i;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return j;
            case 4:
                return k;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return l;
            case 6:
                return y;
            case 7:
                return m;
            case 8:
                return p;
            case 9:
                return q;
            case 10:
                return r;
            case 11:
                return s;
            case 12:
                return t;
            case 13:
                return u;
            case 14:
                return v;
            case 15:
                return x;
            case 16:
                return K;
            case 17:
                return e1;
            case 18:
                return n1;
            case 19:
                return h1;
            case 20:
                return i1;
            case 21:
                return r1;
            case 22:
                return s1;
            case 23:
                return M;
            case 24:
                return N;
            case 25:
                return X;
            case 26:
                return w;
            case 27:
                return A;
            case 28:
                return B;
            case 29:
                return C;
            case 30:
                return Y;
            case 31:
                return Z;
            case 32:
                return a0;
            case 33:
                return b0;
            case 34:
                return d0;
            case 35:
                return e0;
            case 36:
                return f0;
            case 37:
                return g0;
            case 38:
                return h0;
            case 39:
                return i0;
            case 40:
                return j0;
            case 41:
                return k0;
            case 42:
                return D1;
            case 43:
                return E1;
            case 44:
                return F1;
            case 45:
                return l0;
            case 46:
                return y0;
            case 47:
                return z0;
            case 48:
                return B0;
            case 49:
                return C0;
            case 50:
                return D0;
            case 51:
                return E0;
            case 52:
                return F0;
            case 53:
                return G0;
            case 54:
                return n;
            case 55:
                return J0;
            case 56:
                return L;
            case 57:
                return K0;
            case 58:
                return L0;
            case 59:
                return M0;
            case 60:
                return N0;
            case 61:
                return O0;
            case 62:
                return P0;
            case 63:
                return H0;
            case 64:
                return Q0;
            case 65:
                return R0;
            case 66:
                return S0;
            case 67:
                return T0;
            case 68:
                return U0;
            case 69:
                return W0;
            case 70:
                return d1;
            case 71:
                return g1;
            case 72:
                return j1;
            case 73:
                return C1;
            case 74:
                return c0;
            case 75:
                return O1;
            case 76:
                return P1;
            case 77:
                return Q1;
            case 78:
                return R1;
            case 79:
                return X0;
            case 80:
                return V0;
            case 81:
                return k1;
            case 82:
                return l1;
            case 83:
                return w1;
            case 84:
                return x1;
            case 85:
                return z;
            case 86:
                return S1;
            case 87:
                return X1;
            case 88:
                return Z0;
            case 89:
                return a1;
            case 90:
                return m1;
            case 91:
                return o1;
            case 92:
                return p1;
            case 93:
                return q1;
            case 94:
                return t1;
            case 95:
                return u1;
            case 96:
                return v1;
            case 97:
                return b2;
            case 98:
                return Z1;
            case 99:
                return c2;
            case 100:
                return d2;
            case 101:
                return f1;
            case 102:
                return e2;
            case 103:
                return f2;
            case 104:
                return g2;
            case 105:
                return h2;
            case 106:
                return i2;
            case 107:
                return Y1;
            case 108:
                return R;
            case 109:
                return S;
            case 110:
                return T;
            case 111:
                return U;
            case 112:
                return V;
            case 113:
                return j2;
            case 114:
                return m2;
            case 115:
                return n2;
            case 116:
                return o2;
            case 117:
                return p2;
            case 118:
                return G1;
            case 119:
                return H1;
            case 120:
                return I1;
            case 121:
                return J1;
            case 122:
                return K1;
            case 123:
                return L1;
            case 124:
                return q2;
            case 125:
                return r2;
            case 126:
                return m0;
            case 127:
                return y1;
            case 128:
                return B1;
            case 129:
                return y2;
            case 130:
                return z2;
            case 131:
                return s2;
            case 132:
                return z1;
            case 133:
                return A1;
            case 134:
                return t2;
            case 135:
                return A2;
            case 136:
                return B2;
            case 137:
                return O;
            case 138:
                return P;
            case 139:
                return C2;
            case 140:
                return D2;
            case 141:
                return E2;
            case 142:
                return F2;
            case 143:
                return G2;
            case 144:
                return k2;
            case 145:
                return l2;
            case 146:
                return b1;
            case 147:
                return c1;
            case 148:
                return u2;
            case 149:
                return H2;
            case 150:
                return I2;
            case 151:
                return a2;
            case 152:
                return J2;
            case 153:
                return K2;
            case 154:
                return L2;
            case 155:
                return M2;
            case 156:
                return Q;
            case 157:
                return v2;
            case 158:
                return T1;
            case 159:
                return U1;
            case 160:
                return V1;
            case 161:
                return x2;
            case 162:
                return W1;
            case 163:
                return o0;
            case 164:
                return Y0;
            case 165:
                return M1;
            case 166:
                return N1;
            case 167:
                return N2;
            case 168:
                return O2;
            case 169:
                return P2;
            case 170:
                return w2;
            case 171:
                return p0;
            case 172:
                return q0;
            case 173:
                return r0;
            case 174:
                return Q2;
            case 175:
                return R2;
            case 176:
                return S2;
            case 177:
                return T2;
            case 178:
                return U2;
            case 179:
                return w0;
            case 180:
                return x0;
            case 181:
                return W2;
            case 182:
                return X2;
            case 183:
                return u0;
            case 184:
                return n0;
            case 185:
                return V2;
            case 186:
                return Z2;
            case 187:
                return v0;
            case 188:
                return Y2;
            case 189:
                return a3;
            case 190:
                return s0;
            case 191:
                return t0;
            case 192:
                return b3;
            case 193:
                return c3;
            case 194:
                return A0;
            case 195:
                return W;
            case 196:
                return E;
            case 197:
                return F;
            case 198:
                return f11439J;
            case 199:
                return d3;
            case 200:
                return e3;
            case 201:
                return D;
            case 202:
                return I0;
            case 203:
                return o;
            case 204:
                return f3;
            case 205:
                return g3;
            case 206:
                return h3;
            case 207:
                return G;
            case 208:
                return H;
            case 209:
                return I;
            case 210:
                return i3;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + D83.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.a + " name=" + name() + '>';
    }

    D83(String str) {
        this.a = r2;
    }
}
