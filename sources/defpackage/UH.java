package defpackage;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UH {
    public final Context a;
    public final String b;
    public final L43 c;
    public final CastOptions d;
    public final BinderC6619jR1 e;

    public UH(Context context, CastOptions castOptions, BinderC6619jR1 binderC6619jR1) {
        String a;
        if (Collections.unmodifiableList(castOptions.g).isEmpty()) {
            a = AH.b(castOptions.a);
        } else {
            String str = castOptions.a;
            List unmodifiableList = Collections.unmodifiableList(castOptions.g);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            a = AH.a(str, unmodifiableList);
        }
        this.c = new L43(this);
        this.a = context.getApplicationContext();
        this.b = a;
        this.d = castOptions;
        this.e = binderC6619jR1;
    }
}
