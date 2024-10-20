package defpackage;

import J.N;
import java.io.Serializable;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5901hL implements Serializable {
    public final int a;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    public C5901hL(int i, String str, String str2, String str3, boolean z) {
        this.a = i;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z;
    }

    public final void a(Profile profile) {
        if (this.j) {
            return;
        }
        N.Mw9TjMNp(profile, this.a, this.g, this.i);
    }
}
