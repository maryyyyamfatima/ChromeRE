package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class B74 {
    public static C9694sO0 a(Status status, String str) {
        String str2 = status.h;
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        switch (status.g) {
            case 17510:
                return new C10380uO0(str);
            case 17511:
                return new C10723vO0(str);
            case 17512:
            default:
                return new C9694sO0(str);
            case 17513:
                return new C10037tO0(str);
            case 17514:
                return new C9351rO0(str);
        }
    }
}
