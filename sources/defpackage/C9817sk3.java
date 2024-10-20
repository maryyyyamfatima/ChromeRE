package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sk3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9817sk3 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public C9817sk3(Context context) {
        this.a = context;
    }

    public final C9132qk3 a(int[] iArr, int i) {
        ArrayList arrayList = this.b;
        C9132qk3 c9132qk3 = new C9132qk3(i, iArr, arrayList.size() + 1);
        arrayList.add(c9132qk3);
        return c9132qk3;
    }

    public final void b(C9132qk3 c9132qk3, C9132qk3 c9132qk32, int i) {
        this.c.add(new C9474rk3(i, c9132qk3.c, c9132qk32.c));
    }

    public final AnimatedStateListDrawable c() {
        Context context;
        AnimatedStateListDrawable animatedStateListDrawable = new AnimatedStateListDrawable();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            context = this.a;
            if (i >= size) {
                break;
            }
            C9132qk3 c9132qk3 = (C9132qk3) arrayList.get(i);
            animatedStateListDrawable.addState(c9132qk3.b, AbstractC2884Wf.a(context, c9132qk3.a), c9132qk3.c);
            i++;
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C9474rk3 c9474rk3 = (C9474rk3) arrayList2.get(i2);
            animatedStateListDrawable.addTransition(c9474rk3.b, c9474rk3.c, (Drawable) ((Animatable) AbstractC2884Wf.a(context, c9474rk3.a)), false);
        }
        return animatedStateListDrawable;
    }
}
