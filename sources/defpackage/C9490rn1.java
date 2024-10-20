package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9490rn1 {
    public final PackageManager a;
    public final C10176tn1 b;
    public final HashSet c = new HashSet();

    public C9490rn1(Context context, C10176tn1 c10176tn1) {
        this.a = context.getPackageManager();
        this.b = c10176tn1;
    }
}
