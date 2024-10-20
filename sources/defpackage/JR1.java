package defpackage;

import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JR1 {
    public final PR1 a;

    public JR1(int i, int i2, String str) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new OR1(i, i2, str);
        } else {
            this.a = new PR1(i, i2, str);
        }
    }

    public JR1(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        String packageName;
        packageName = mediaSessionManager$RemoteUserInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.a = new OR1(mediaSessionManager$RemoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JR1)) {
            return false;
        }
        return this.a.equals(((JR1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
