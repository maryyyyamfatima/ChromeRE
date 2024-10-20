package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.ocr.RecognitionScreen;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526Eb0 {
    public final Context a;
    public final Intent b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public C0526Eb0(Context context) {
        this.a = context;
        Intent intent = new Intent("com.google.android.gms.ocr.ACTION_CREDIT_CARD_OCR");
        this.b = intent;
        intent.setPackage("com.google.android.gms");
    }

    public final Intent b() {
        Context context = this.a;
        if (context.getPackageManager().checkPermission("android.permission.CAMERA", "com.google.android.gms") != 0) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = this.b;
        int i = H01.a;
        if (!(packageManager.resolveActivity(intent, 65536) != null)) {
            return null;
        }
        int c = C8543p11.d.c(context, 12800000);
        if (c != 0) {
            Log.w("CreditCardOcrIntentBuilder", "Google Play services is unavailable. Result=" + c);
            return null;
        }
        if (c(3) || c(4)) {
            a();
            intent.hasExtra("com.google.android.gms.ocr.INTEGRATOR_APP_LABEL");
        } else if (c(1)) {
            a();
        }
        return intent;
    }

    public final void a() {
        int[] iArr;
        ArrayList<? extends Parcelable> arrayList = this.c;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.d;
        if (!isEmpty) {
            arrayList2.isEmpty();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.google.android.gms.ocr.RECOGNITION_SCREENS", arrayList);
        int i = 0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            iArr = new int[0];
        } else {
            iArr = new int[arrayList2.size()];
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                iArr[i] = ((Integer) it.next()).intValue();
                i++;
            }
        }
        bundle.putIntArray("com.google.android.gms.ocr.RECOGNITION_SCREENTYPES", iArr);
        this.b.putExtra("com.google.android.gms.ocr.RECOGNITION", bundle);
    }

    public final boolean c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            if (((RecognitionScreen) it.next()).h == i) {
                return true;
            }
        }
        return this.d.contains(Integer.valueOf(i));
    }
}
