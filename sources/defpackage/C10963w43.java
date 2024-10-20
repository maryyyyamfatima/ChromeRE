package defpackage;

import android.content.Context;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w43, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10963w43 {
    public static C10963w43 d;
    public String a = null;
    public Boolean b = null;
    public final ArrayDeque c = new ArrayDeque();

    public final boolean a(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.b.booleanValue();
        return this.b.booleanValue();
    }
}
