package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import org.chromium.components.browser_ui.contacts_picker.ContactView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FL0 extends AbstractC0185Bl {
    public final String h;
    public int i;
    public final ContentResolver j;
    public final EL0 k;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (h()) {
            return;
        }
        K40 k40 = (K40) this.k;
        ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu2 = k40.z;
        C6461iy c6461iy = viewOnClickListenerC10219tu2.o.a;
        String str = this.h;
        if (c6461iy.a(str) == null) {
            C8848pu2 c8848pu2 = viewOnClickListenerC10219tu2.o;
            HashSet hashSet = c8848pu2.b;
            if (bitmap == null) {
                hashSet.add(str);
            } else {
                c8848pu2.a.c(bitmap, str);
                hashSet.remove(str);
            }
        }
        if (bitmap == null || !str.equals(k40.C.a)) {
            return;
        }
        ContactView contactView = k40.B;
        C5590gR2 c5590gR2 = new C5590gR2(contactView.F.getResources(), bitmap);
        c5590gR2.k = true;
        c5590gR2.j = true;
        c5590gR2.g = Math.min(c5590gR2.m, c5590gR2.l) / 2;
        c5590gR2.d.setShader(c5590gR2.e);
        c5590gR2.invalidateSelf();
        contactView.s(c5590gR2);
    }

    public FL0(String str, ContentResolver contentResolver, EL0 el0) {
        this.h = str;
        this.j = contentResolver;
        this.k = el0;
    }

    @Override // defpackage.AbstractC0185Bl
    /* renamed from: n */
    public final Bitmap b() {
        byte[] blob;
        if (h()) {
            return null;
        }
        Cursor query = this.j.query(Uri.withAppendedPath(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(this.h)), "photo"), new String[]{"data15"}, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (blob = query.getBlob(0)) == null) {
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(blob));
            int i = this.i;
            if (i > 0) {
                decodeStream = Bitmap.createScaledBitmap(decodeStream, i, i, true);
            }
            return decodeStream;
        } finally {
            query.close();
        }
    }
}
