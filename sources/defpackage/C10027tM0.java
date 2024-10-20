package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tM0 */
/* loaded from: classes2.dex */
public final class C10027tM0 extends AbstractC0185Bl {
    public final WindowAndroid h;
    public final InterfaceC9684sM0 i;
    public final C7337lX1 j;
    public final boolean k;
    public final boolean l;
    public final ContentResolver m;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        List list = (List) obj;
        if (h()) {
            return;
        }
        ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = (ViewOnClickListenerC9876su2) this.i;
        viewOnClickListenerC9876su2.getClass();
        if (list == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - viewOnClickListenerC9876su2.E;
        EI2.n(elapsedRealtime, "Android.PhotoPicker.EnumerationTime");
        EI2.f(list.size(), 1, 10000, 50, "Android.PhotoPicker.EnumeratedFiles");
        EI2.c((int) ((list.size() * 100) / elapsedRealtime), "Android.PhotoPicker.EnumeratedRate");
        viewOnClickListenerC9876su2.i = list;
        if (viewOnClickListenerC9876su2.F) {
            viewOnClickListenerC9876su2.n.t();
        }
    }

    public C10027tM0(WindowAndroid windowAndroid, ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2, C7337lX1 c7337lX1, List list, ContentResolver contentResolver) {
        this.h = windowAndroid;
        this.i = viewOnClickListenerC9876su2;
        this.j = c7337lX1;
        this.m = contentResolver;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("image/")) {
                this.k = true;
            } else if (str.startsWith("video/")) {
                this.l = true;
            }
            if (this.k && this.l) {
                return;
            }
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Object obj = ThreadUtils.a;
        if (!h()) {
            ArrayList arrayList = new ArrayList();
            int i = Build.VERSION.SDK_INT;
            String str = i >= 29 ? "relative_path" : "_data";
            String[] strArr = {"_id", "date_added", "media_type", "mime_type", str};
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" LIKE ? OR ");
            sb.append(str);
            sb.append(" LIKE ? OR ");
            sb.append(str);
            AbstractC9972tB0.a(sb, " LIKE ? OR ", str, " LIKE ? OR ", str);
            String a = AbstractC10204ts.a(sb, " LIKE ? OR ", str, " LIKE ?");
            boolean z = this.k;
            String str2 = z ? "media_type=1" : "";
            if (this.l) {
                if (z) {
                    str2 = str2.concat(" OR ");
                }
                str2 = AbstractC7848n0.a(str2, "media_type=3");
            }
            if (!str2.isEmpty()) {
                a = a + " AND (" + str2 + ")";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Environment.DIRECTORY_DCIM);
            String a2 = Y5.a(sb2, File.separator, "Camera");
            String str3 = Environment.DIRECTORY_PICTURES;
            String str4 = Environment.DIRECTORY_MOVIES;
            String str5 = Environment.DIRECTORY_DOWNLOADS;
            String a3 = Y5.a(new StringBuilder(), Environment.DIRECTORY_DCIM, "/Restored");
            String a4 = Y5.a(new StringBuilder(), Environment.DIRECTORY_DCIM, "/Screenshots");
            if (i < 29) {
                a2 = Environment.getExternalStoragePublicDirectory(a2).toString();
                str3 = Environment.getExternalStoragePublicDirectory(str3).toString();
                str4 = Environment.getExternalStoragePublicDirectory(str4).toString();
                str5 = Environment.getExternalStoragePublicDirectory(str5).toString();
                a3 = Environment.getExternalStoragePublicDirectory(a3).toString();
                a4 = Environment.getExternalStoragePublicDirectory(a4).toString();
            }
            String[] strArr2 = {AbstractC7848n0.a(a2, "%"), AbstractC7848n0.a(str3, "%"), AbstractC7848n0.a(str4, "%"), AbstractC7848n0.a(str5, "%"), AbstractC7848n0.a(a3, "%"), AbstractC7848n0.a(a4, "%")};
            Uri contentUri = MediaStore.Files.getContentUri("external");
            Cursor query = this.m.query(contentUri, strArr, a, strArr2, "date_added DESC");
            if (query != null) {
                StringBuilder sb3 = new StringBuilder("Found ");
                sb3.append(query.getCount());
                sb3.append(" media files, when requesting columns: ");
                AbstractC9972tB0.a(sb3, Arrays.toString(strArr), ", with WHERE ", a, ", params: ");
                sb3.append(Arrays.toString(strArr2));
                AbstractC4851eH1.d("PhotoPicker", sb3.toString(), new Object[0]);
                while (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex("mime_type"));
                    if (this.j.a(null, string)) {
                        arrayList.add(new C6441iu2(ContentUris.withAppendedId(contentUri, query.getInt(query.getColumnIndex("_id"))), query.getLong(query.getColumnIndex("date_added")), string.startsWith("video/") ? 3 : 0));
                    }
                }
                query.close();
                arrayList.add(0, new C6441iu2(null, 0L, 2));
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                WindowAndroid windowAndroid = this.h;
                windowAndroid.getClass();
                if (!(WindowAndroid.i(intent) && (windowAndroid.hasPermission("android.permission.CAMERA") || windowAndroid.canRequestPermission("android.permission.CAMERA")))) {
                    return arrayList;
                }
                arrayList.add(0, new C6441iu2(null, 0L, 1));
                return arrayList;
            }
            AbstractC4851eH1.a("PhotoPicker", "Content Resolver query() returned null", new Object[0]);
        }
        return null;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void i() {
        this.i.getClass();
    }
}
