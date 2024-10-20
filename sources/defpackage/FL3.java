package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.thumbnail.generator.ThumbnailGenerator;
import org.chromium.chrome.browser.thumbnail.generator.ThumbnailGeneratorCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FL3 implements ThumbnailGeneratorCallback {
    public static final LinkedHashSet g = new LinkedHashSet();
    public static final HashMap h = new HashMap();
    public final ThumbnailGenerator a;
    public File b;
    public final NL3 c;
    public final int d;
    public long e;
    public boolean f;

    public FL3(NL3 nl3, ThumbnailGenerator thumbnailGenerator) {
        Object obj = ThreadUtils.a;
        this.c = nl3;
        this.a = thumbnailGenerator;
        this.d = 5242880;
        new EL3(this).c(AbstractC0185Bl.f);
    }

    @Override // org.chromium.chrome.browser.thumbnail.generator.ThumbnailGeneratorCallback
    public final void a(int i, Bitmap bitmap, String str) {
        if (this.f) {
            return;
        }
        Object obj = ThreadUtils.a;
        if (bitmap != null && !TextUtils.isEmpty(str)) {
            new DL3(this, str, bitmap, i).c(AbstractC0185Bl.f);
        }
        ((IL3) this.c).b(bitmap, str);
    }

    public final void c(C8776pi2 c8776pi2) {
        long j;
        Object obj = ThreadUtils.a;
        String str = (String) c8776pi2.a;
        int intValue = ((Integer) c8776pi2.b).intValue();
        File file = new File(b(intValue, str));
        if (!file.exists()) {
            AbstractC4851eH1.a("ThumbnailStorage", "Error while removing from disk. File does not exist.", new Object[0]);
            return;
        }
        try {
            j = file.length();
        } catch (SecurityException e) {
            AbstractC4851eH1.a("ThumbnailStorage", "Error while removing from disk. File denied read access.", e);
            j = 0;
        }
        File file2 = new File(file.getPath() + ".new");
        File file3 = new File(file.getPath() + ".bak");
        file.delete();
        file2.delete();
        file3.delete();
        g.remove(c8776pi2);
        HashMap hashMap = h;
        ((HashSet) hashMap.get(str)).remove(Integer.valueOf(intValue));
        if (((HashSet) hashMap.get(str)).size() == 0) {
            hashMap.remove(str);
        }
        this.e -= j;
    }

    public final String b(int i, String str) {
        return this.b.getPath() + File.separator + str + i + ".entry";
    }
}
