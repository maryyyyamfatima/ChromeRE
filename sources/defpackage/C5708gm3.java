package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gm3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5708gm3 {
    public static final ReentrantLock c = new ReentrantLock();
    public static C5708gm3 d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public C5708gm3(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }
}
