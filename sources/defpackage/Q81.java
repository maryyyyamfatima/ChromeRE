package defpackage;

import android.text.TextUtils;
import com.android.chrome.R;
import java.util.Arrays;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q81 extends AbstractC2500Tg0 {
    public final GURL c;
    public final String d;
    public final String e;
    public final boolean f;
    public final long g;
    public final long[] h;
    public Long i;
    public O81 j;

    public Q81(GURL gurl, String str, String str2, long j, long[] jArr, boolean z) {
        this.c = gurl;
        this.d = str;
        if (z) {
            str2 = V60.a.getString(R.string.f67470_resource_name_obfuscated_res_0x7f1401e0);
        } else if (TextUtils.isEmpty(str2)) {
            str2 = gurl.i();
        }
        this.e = str2;
        this.g = j;
        this.h = Arrays.copyOf(jArr, jArr.length);
        this.f = z;
    }

    @Override // defpackage.AbstractC2500Tg0
    public final long b() {
        return this.g;
    }

    @Override // defpackage.AbstractC2500Tg0
    public final long a() {
        if (this.i == null) {
            Long valueOf = Long.valueOf(this.c.hashCode());
            this.i = valueOf;
            this.i = Long.valueOf((valueOf.longValue() << 32) + ((-1) & this.g));
        }
        return this.i.longValue();
    }
}
