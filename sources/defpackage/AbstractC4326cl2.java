package defpackage;

import org.chromium.chrome.browser.password_check.CompromisedCredential;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cl2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4326cl2 {
    public static void b(int i) {
        EI2.h(i, 13, "PasswordManager.BulkCheck.UserActionAndroid");
    }

    public static void a(int i, CompromisedCredential compromisedCredential) {
        if (compromisedCredential.r) {
            EI2.h(i, 5, "PasswordManager.AutomaticChange.ForSitesWithScripts");
        }
        if (compromisedCredential.s) {
            EI2.h(i, 5, "PasswordManager.AutomaticChange.AcceptanceWithAutoButton");
        } else {
            EI2.h(i, 5, "PasswordManager.AutomaticChange.AcceptanceWithoutAutoButton");
        }
    }
}
