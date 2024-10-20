package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5584gQ1 {
    public final Context a;
    public final C4553dQ1 g;
    public final HandlerC4209cQ1 h = new HandlerC4209cQ1(this);
    public C10734vQ1 i;
    public WP1 j;
    public boolean k;
    public C5928hQ1 l;
    public boolean m;

    public abstract AbstractC4896eQ1 d(String str);

    public abstract void f(WP1 wp1);

    public AbstractC5584gQ1(Context context, C4553dQ1 c4553dQ1) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.a = context;
        if (c4553dQ1 == null) {
            this.g = new C4553dQ1(new ComponentName(context, getClass()));
        } else {
            this.g = c4553dQ1;
        }
    }

    public final void h(WP1 wp1) {
        MQ1.b();
        if (Objects.equals(this.j, wp1)) {
            return;
        }
        this.j = wp1;
        if (this.k) {
            return;
        }
        this.k = true;
        this.h.sendEmptyMessage(2);
    }

    public final void g(C5928hQ1 c5928hQ1) {
        MQ1.b();
        if (this.l != c5928hQ1) {
            this.l = c5928hQ1;
            if (this.m) {
                return;
            }
            this.m = true;
            this.h.sendEmptyMessage(1);
        }
    }

    public AbstractC4896eQ1 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return d(str);
    }

    public AbstractC3866bQ1 c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
}
