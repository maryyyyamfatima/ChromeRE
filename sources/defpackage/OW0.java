package defpackage;

import android.content.ContentResolver;
import java.util.NoSuchElementException;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OW0 implements InterfaceC0048Aj2 {
    public final long a = Math.min(20L, AbstractC7192l51.e(PW0.b(), "sole:chrome_bookmark_count"));
    public int g;

    @Override // defpackage.InterfaceC0048Aj2
    public final void close() {
    }

    public OW0() {
        ContentResolver b = PW0.b();
        String[] strArr = {"sole:chrome_"};
        synchronized (AbstractC7192l51.class) {
            AbstractC7192l51.c(b);
            String[] a = AbstractC7192l51.a(strArr);
            if (AbstractC7192l51.l && !AbstractC7192l51.f.isEmpty()) {
                if (a.length != 0) {
                    AbstractC7192l51.b(b, a);
                }
            }
            AbstractC7192l51.b(b, AbstractC7192l51.m);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return ((long) this.g) < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = ThreadUtils.a;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g++;
        C0178Bj2 c0178Bj2 = new C0178Bj2();
        try {
            c0178Bj2.a = this.g;
            c0178Bj2.c = AbstractC7192l51.d(PW0.b(), "sole:chrome_bookmark_is_folder_" + c0178Bj2.a, false);
            c0178Bj2.b = AbstractC7192l51.e(PW0.b(), "sole:chrome_bookmark_parent_id_" + c0178Bj2.a);
            c0178Bj2.e = AbstractC7192l51.f(PW0.b(), "sole:chrome_bookmark_title_" + c0178Bj2.a, null);
            if (c0178Bj2.c) {
                return c0178Bj2;
            }
            c0178Bj2.d = AbstractC7192l51.f(PW0.b(), "sole:chrome_bookmark_url_" + c0178Bj2.a, null);
            return c0178Bj2;
        } catch (Exception e) {
            AbstractC4851eH1.d("ADCP", "Dropping the bookmark: " + e.getMessage(), new Object[0]);
            return null;
        }
    }
}
