package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xe1 */
/* loaded from: classes.dex */
public final class C11494xe1 {
    public final Context a;
    public final KU3 b;
    public final Tab c;

    public C11494xe1(Context context, Tab tab) {
        this.a = context;
        this.b = LU3.a(Profile.b(tab.b()));
        this.c = tab;
    }
}
