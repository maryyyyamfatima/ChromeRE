package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1569Mc {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "NOT_SET";
        }
        if (i == 2) {
            return "SURVEY_SHOWN";
        }
        if (i == 3) {
            return "SURVEY_ACCEPTED";
        }
        if (i == 4) {
            return "INVITATION_ANSWERED";
        }
        if (i == 5) {
            return "QUESTION_ANSWERED";
        }
        if (i == 6) {
            return "SURVEY_CLOSED";
        }
        throw null;
    }

    public static /* synthetic */ int b(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("NOT_SET")) {
            return 1;
        }
        if (str.equals("SURVEY_SHOWN")) {
            return 2;
        }
        if (str.equals("SURVEY_ACCEPTED")) {
            return 3;
        }
        if (str.equals("INVITATION_ANSWERED")) {
            return 4;
        }
        if (str.equals("QUESTION_ANSWERED")) {
            return 5;
        }
        if (str.equals("SURVEY_CLOSED")) {
            return 6;
        }
        throw new IllegalArgumentException("No enum constant com.google.android.libraries.surveys.internal.model.Answer.AnswerType.".concat(str));
    }
}
