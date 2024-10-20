package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K62 {
    public RemoteViews A;
    public String B;
    public long C;
    public final boolean D;
    public final Notification E;
    public boolean F;
    public Icon G;
    public final ArrayList H;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public Bitmap h;
    public CharSequence i;
    public int j;
    public int k;
    public M62 m;
    public CharSequence n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public String u;
    public Bundle v;
    public Notification y;
    public RemoteViews z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean l = true;
    public boolean t = false;
    public int w = 0;
    public int x = 0;

    public K62(Context context, String str) {
        Notification notification = new Notification();
        this.E = notification;
        this.a = context;
        this.B = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.H = new ArrayList();
        this.D = true;
    }

    public final void f(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void e(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void i(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f29530_resource_name_obfuscated_res_0x7f08011a);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f29520_resource_name_obfuscated_res_0x7f080119);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        this.h = bitmap;
    }

    public final void j(Uri uri) {
        Notification notification = this.E;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void d(boolean z) {
        h(16, z);
    }

    public final void g(int i) {
        Notification notification = this.E;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void h(int i, boolean z) {
        Notification notification = this.E;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void a(int i, String str, PendingIntent pendingIntent) {
        this.b.add(new F62(i == 0 ? null : IconCompat.b(null, "", i), str, pendingIntent, new Bundle(), null, null, true, 0, true, false, false));
    }

    public final void k(M62 m62) {
        if (this.m != m62) {
            this.m = m62;
            if (m62 != null) {
                m62.f(this);
            }
        }
    }

    public final Notification b() {
        Notification notification;
        Bundle bundle;
        S62 s62 = new S62(this);
        K62 k62 = s62.c;
        M62 m62 = k62.m;
        if (m62 != null) {
            m62.b(s62);
        }
        if (m62 != null) {
            m62.e();
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = s62.b;
        if (i >= 26) {
            notification = builder.build();
        } else {
            int i2 = s62.g;
            if (i >= 24) {
                notification = builder.build();
                if (i2 != 0) {
                    if (notification.getGroup() != null && (notification.flags & 512) != 0 && i2 == 2) {
                        S62.a(notification);
                    }
                    if (notification.getGroup() != null && (notification.flags & 512) == 0 && i2 == 1) {
                        S62.a(notification);
                    }
                }
            } else {
                builder.setExtras(s62.f);
                Notification build = builder.build();
                RemoteViews remoteViews = s62.d;
                if (remoteViews != null) {
                    build.contentView = remoteViews;
                }
                RemoteViews remoteViews2 = s62.e;
                if (remoteViews2 != null) {
                    build.bigContentView = remoteViews2;
                }
                if (i2 != 0) {
                    if (build.getGroup() != null && (build.flags & 512) != 0 && i2 == 2) {
                        S62.a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && i2 == 1) {
                        S62.a(build);
                    }
                }
                notification = build;
            }
        }
        RemoteViews remoteViews3 = k62.z;
        if (remoteViews3 != null) {
            notification.contentView = remoteViews3;
        }
        if (m62 != null) {
            m62.d();
        }
        if (m62 != null) {
            k62.m.getClass();
        }
        if (m62 != null && (bundle = notification.extras) != null) {
            m62.a(bundle);
        }
        return notification;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }
}
