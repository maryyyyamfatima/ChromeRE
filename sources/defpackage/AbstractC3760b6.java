package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3760b6 {
    public Random a = new Random();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public ArrayList e = new ArrayList();
    public final transient HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final Bundle h = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        S5 s5;
        String str = (String) this.b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C3416a6 c3416a6 = (C3416a6) this.f.get(str);
        if (c3416a6 != null && (s5 = c3416a6.a) != null && this.e.contains(str)) {
            s5.a(c3416a6.b.c(intent, i2));
            this.e.remove(str);
            return true;
        }
        this.g.remove(str);
        this.h.putParcelable(str, new ActivityResult(intent, i2));
        return true;
    }

    public final Z5 b(String str, U5 u5, S5 s5) {
        int i;
        HashMap hashMap;
        HashMap hashMap2 = this.c;
        if (((Integer) hashMap2.get(str)) == null) {
            int nextInt = this.a.nextInt(2147418112);
            while (true) {
                i = nextInt + 65536;
                hashMap = this.b;
                if (!hashMap.containsKey(Integer.valueOf(i))) {
                    break;
                }
                nextInt = this.a.nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i), str);
            hashMap2.put(str, Integer.valueOf(i));
        }
        this.f.put(str, new C3416a6(s5, u5));
        HashMap hashMap3 = this.g;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            s5.a(obj);
        }
        Bundle bundle = this.h;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            s5.a(u5.c(activityResult.g, activityResult.a));
        }
        return new Z5(this, str, u5);
    }
}
