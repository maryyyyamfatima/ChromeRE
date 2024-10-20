package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.chrome.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yn1 */
/* loaded from: classes.dex */
public final class C11891yn1 {
    public final C2037Pr2 a;
    public final InterfaceC3241Yy1 b;
    public final HashSet c = new HashSet();

    public C11891yn1(C2037Pr2 c2037Pr2, InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = c2037Pr2;
        this.b = interfaceC3241Yy1;
    }

    public final void a(String str, final C1193Je2 c1193Je2) {
        ArrayList arrayList;
        HashSet hashSet = this.c;
        if (hashSet.contains(c1193Je2)) {
            return;
        }
        C9490rn1 c9490rn1 = (C9490rn1) this.b.get();
        PackageManager packageManager = c9490rn1.a;
        HashSet hashSet2 = c9490rn1.c;
        StringBuilder a = M41.a(str, ":");
        a.append(c1193Je2.toString());
        if (hashSet2.add(a.toString())) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                String charSequence = packageManager.getApplicationLabel(applicationInfo).toString();
                if (!TextUtils.isEmpty(charSequence) && applicationInfo.uid != -1) {
                    c9490rn1.b.f(applicationInfo.uid, charSequence, str, T34.b(c1193Je2.toString(), true), c1193Je2);
                }
                AbstractC4851eH1.a("DataRecorder", "Invalid details for client package %s: %d, %s", str, Integer.valueOf(applicationInfo.uid), charSequence);
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC4851eH1.a("DataRecorder", "Couldn't find name for client package %s", str);
            }
        }
        C2037Pr2 c2037Pr2 = this.a;
        c2037Pr2.getClass();
        Intent intent = new Intent();
        intent.setPackage(str);
        Uri uri = c1193Je2.a;
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        AN3 an3 = new AN3("BrowserServices.BrowsableIntentCheck", 1);
        an3.h = SystemClock.uptimeMillis();
        try {
            boolean z = AbstractC3017Xf2.c(intent, 0) != null;
            an3.close();
            if (z) {
                C11205wn1 c11205wn1 = c2037Pr2.a;
                C5920hO3 c5920hO3 = null;
                try {
                    arrayList = (Build.VERSION.SDK_INT >= 28 ? new C2107Qf2() : new C2237Rf2()).a(c11205wn1.b, str);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("PackageIdentity", "Could not get fingerprint for package.", e);
                    arrayList = null;
                }
                if (arrayList != null) {
                    try {
                        c5920hO3 = new C5920hO3(C6606jO3.a(str, arrayList));
                    } catch (IOException e2) {
                        Log.e("Token", "Exception when creating token.", e2);
                    }
                }
                if (c5920hO3 != null) {
                    C11548xn1 c11548xn1 = c11205wn1.a;
                    c11548xn1.getClass();
                    String a2 = C11548xn1.a(c1193Je2);
                    Set<String> emptySet = Collections.emptySet();
                    SharedPreferences sharedPreferences = c11548xn1.a;
                    HashSet hashSet3 = new HashSet(sharedPreferences.getStringSet(a2, emptySet));
                    byte[] bArr = c5920hO3.a.a;
                    hashSet3.add(Base64.encodeToString(Arrays.copyOf(bArr, bArr.length), 3));
                    sharedPreferences.edit().putStringSet(a2, hashSet3).apply();
                }
                final C72 c72 = c2037Pr2.b;
                c72.getClass();
                UX3 ux3 = new UX3() { // from class: y72
                    @Override // defpackage.UX3
                    public final /* synthetic */ void a() {
                    }

                    @Override // defpackage.UX3
                    public final void b(ComponentName componentName, int i) {
                        C1193Je2 c1193Je22 = c1193Je2;
                        C72 c722 = C72.this;
                        c722.getClass();
                        c722.a(c1193Je22, 0L, componentName.getPackageName(), i);
                    }
                };
                VX3 vx3 = c72.b;
                vx3.getClass();
                vx3.b(uri, new LX3(vx3, V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406df), ux3));
            }
            hashSet.add(c1193Je2);
        } finally {
        }
    }
}
