package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Zs4 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final List f;
    public final List g;
    public final PendingIntent h;
    public final List i;

    public Zs4(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = pendingIntent;
        this.i = list3;
    }

    public static Zs4 a(int i, int i2, int i3, long j, long j2, List list, List list2) {
        if (i2 != 8) {
            return new Zs4(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static Zs4 b(Bundle bundle) {
        return new Zs4(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public final ArrayList c() {
        List list = this.f;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Zs4) {
            Zs4 zs4 = (Zs4) obj;
            if (this.a == zs4.a && this.b == zs4.b && this.c == zs4.c && this.d == zs4.d && this.e == zs4.e) {
                List list = zs4.f;
                List list2 = this.f;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = zs4.g;
                    List list4 = this.g;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        PendingIntent pendingIntent = zs4.h;
                        PendingIntent pendingIntent2 = this.h;
                        if (pendingIntent2 != null ? pendingIntent2.equals(pendingIntent) : pendingIntent == null) {
                            List list5 = zs4.i;
                            List list6 = this.i;
                            if (list6 != null ? list6.equals(list5) : list5 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i2 = (i ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        List list = this.f;
        int hashCode = (i3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.i;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", errorCode=");
        sb.append(this.c);
        sb.append(", bytesDownloaded=");
        sb.append(this.d);
        sb.append(", totalBytesToDownload=");
        sb.append(this.e);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        AbstractC9972tB0.a(sb, ", languagesNullable=", valueOf2, ", resolutionIntent=", valueOf3);
        return AbstractC10204ts.a(sb, ", splitFileIntents=", valueOf4, "}");
    }
}
