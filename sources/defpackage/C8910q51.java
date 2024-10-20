package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8910q51 extends AbstractC9252r51 {
    public final Object a() {
        Object obj;
        int i;
        ContentResolver contentResolver = AbstractC9252r51.c;
        int intValue = ((Integer) this.b).intValue();
        Uri uri = AbstractC7192l51.a;
        synchronized (AbstractC7192l51.class) {
            AbstractC7192l51.c(contentResolver);
            obj = AbstractC7192l51.k;
        }
        HashMap hashMap = AbstractC7192l51.h;
        Integer valueOf = Integer.valueOf(intValue);
        String str = this.a;
        Integer num = (Integer) AbstractC7192l51.g(hashMap, str, valueOf);
        if (num == null) {
            String f = AbstractC7192l51.f(contentResolver, str, null);
            if (f != null) {
                try {
                    int parseInt = Integer.parseInt(f);
                    num = Integer.valueOf(parseInt);
                    intValue = parseInt;
                } catch (NumberFormatException unused) {
                }
            }
            AbstractC7192l51.h(obj, hashMap, str, num);
            i = intValue;
        } else {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }

    public C8910q51(Integer num) {
        super(num, "gms:feedback_client:feedback_options_max_data_size");
    }
}
