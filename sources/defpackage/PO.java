package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PO {
    public final K62 a;
    public final C7893n72 b;
    public final Context c;

    public final PO f(C4705dr2 c4705dr2) {
        this.a.g = U62.b(0, 0, this.b, c4705dr2);
        return this;
    }

    public PO(Context context, String str, TI ti, C7893n72 c7893n72) {
        if (Build.VERSION.SDK_INT >= 26 && str != null) {
            ti.a(Collections.emptyList(), Collections.singletonList(str));
        }
        K62 k62 = new K62(context, str);
        this.a = k62;
        this.b = c7893n72;
        this.c = context;
        if (c7893n72 != null) {
            k62.E.deleteIntent = U62.b(2, 0, c7893n72, null);
        }
    }

    public final PO a(int i, String str, C4705dr2 c4705dr2, int i2) {
        b(i, str, U62.b(1, i2, this.b, c4705dr2));
        return this;
    }

    public final PO i(C4705dr2 c4705dr2) {
        this.a.E.deleteIntent = U62.b(2, 0, this.b, c4705dr2);
        return this;
    }

    public final PO h(CharSequence charSequence) {
        this.a.f(charSequence);
        return this;
    }

    public final PO g(CharSequence charSequence) {
        this.a.e(charSequence);
        return this;
    }

    public final PO m(Icon icon) {
        IconCompat b;
        IconCompat iconCompat;
        Context context = this.c;
        PorterDuff.Mode mode = IconCompat.k;
        int c = AbstractC10820vg1.c(icon);
        if (c != 2) {
            if (c == 4) {
                Uri d = AbstractC10820vg1.d(icon);
                d.getClass();
                String uri = d.toString();
                uri.getClass();
                iconCompat = new IconCompat(4);
                iconCompat.b = uri;
            } else if (c != 6) {
                b = new IconCompat(-1);
                b.b = icon;
            } else {
                Uri d2 = AbstractC10820vg1.d(icon);
                d2.getClass();
                String uri2 = d2.toString();
                uri2.getClass();
                iconCompat = new IconCompat(6);
                iconCompat.b = uri2;
            }
            b = iconCompat;
        } else {
            String b2 = AbstractC10820vg1.b(icon);
            try {
                b = IconCompat.b(IconCompat.e(context, b2), b2, AbstractC10820vg1.a(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        K62 k62 = this.a;
        k62.G = b.g(k62.a);
        return this;
    }

    public final PO b(int i, String str, PendingIntent pendingIntent) {
        K62 k62 = this.a;
        if (i != 0) {
            PorterDuff.Mode mode = IconCompat.k;
            Context context = this.c;
            context.getClass();
            k62.b.add(new E62(IconCompat.b(context.getResources(), context.getPackageName(), i), str, pendingIntent).a());
        } else {
            k62.a(i, str, pendingIntent);
        }
        return this;
    }

    public final PO n(CharSequence charSequence) {
        K62 k62 = this.a;
        k62.getClass();
        k62.n = K62.c(charSequence);
        return this;
    }

    public final PO j(Bitmap bitmap) {
        this.a.i(bitmap);
        return this;
    }

    public final W72 e(String str) {
        J62 j62 = new J62(this.a);
        j62.d = K62.c(str);
        K62 k62 = j62.a;
        return new W72(k62 != null ? k62.b() : null, this.b);
    }

    public final Notification c() {
        try {
            try {
                Notification b = this.a.b();
                EI2.b("Notifications.Android.Build", true);
                return b;
            } catch (NullPointerException e) {
                AbstractC4851eH1.a("NotifCompatBuilder", "Failed to build notification.", e);
                EI2.b("Notifications.Android.Build", false);
                return null;
            }
        } catch (Throwable th) {
            EI2.b("Notifications.Android.Build", false);
            throw th;
        }
    }

    public final W72 d() {
        return new W72(c(), this.b);
    }

    public final PO l(int i) {
        this.a.E.icon = i;
        return this;
    }

    public final PO k(boolean z) {
        this.a.h(2, z);
        return this;
    }
}
