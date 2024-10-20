package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J20 extends AbstractC0185Bl {
    public final ContentResolver h;
    public final HashSet i;
    public final HashMap j = new HashMap();
    public final List k;
    public final I20 l;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        if (h()) {
            return;
        }
        ((ViewOnClickListenerC10219tu2) this.l).f(this.k);
    }

    public J20(ContentResolver contentResolver, C8848pu2 c8848pu2, ArrayList arrayList, I20 i20) {
        this.h = contentResolver;
        this.i = c8848pu2.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A40 a40 = (A40) it.next();
            HashMap hashMap = this.j;
            String str = a40.a;
            hashMap.put(str, c8848pu2.a.a(str));
        }
        this.k = arrayList;
        this.l = i20;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        for (A40 a40 : this.k) {
            if (!this.i.contains(a40.a)) {
                HashMap hashMap = this.j;
                String str = a40.a;
                Bitmap bitmap = (Bitmap) hashMap.get(str);
                if (bitmap == null) {
                    boolean z = a40.l;
                    Drawable drawable = z ? a40.m : null;
                    if (drawable != null && (drawable instanceof BitmapDrawable)) {
                        bitmap = ((BitmapDrawable) drawable).getBitmap();
                    } else if (!z) {
                        bitmap = new FL0(str, this.h, null).b();
                    }
                }
                if (bitmap != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    H40 h40 = new H40();
                    h40.c = byteArrayOutputStream.toByteArray();
                    h40.b = "image/png";
                    a40.k.add(h40);
                }
            }
        }
        return null;
    }
}
