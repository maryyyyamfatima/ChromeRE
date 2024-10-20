package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.Preferences$UserPrefs;
import com.google.vr.sdk.proto.nano.SdkConfiguration$SdkConfigurationRequest;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rz1 */
/* loaded from: classes4.dex */
public final class C9559rz1 implements Qi4 {
    public final Context a;

    public C9559rz1(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.Qi4
    public final Vr$VREvent$SdkConfigurationParams b(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return null;
    }

    @Override // defpackage.Qi4
    public final void close() {
    }

    @Override // defpackage.Qi4
    public final Preferences$UserPrefs d() {
        return null;
    }

    @Override // defpackage.Qi4
    public final CardboardDevice$DeviceParams a() {
        return (CardboardDevice$DeviceParams) S20.b(CardboardDevice$DeviceParams.class, "current_device_params", 894990891, true);
    }

    @Override // defpackage.Qi4
    public final Display$DisplayParams c() {
        boolean z;
        int i = 0;
        Display$DisplayParams display$DisplayParams = (Display$DisplayParams) S20.b(Display$DisplayParams.class, "phone_params", 779508118, false);
        if (display$DisplayParams != null) {
            return display$DisplayParams;
        }
        ArrayList arrayList = AbstractC5090ey2.a;
        Display$DisplayParams display$DisplayParams2 = new Display$DisplayParams();
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.MODEL;
        String str4 = Build.HARDWARE;
        Iterator it = AbstractC5090ey2.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C4746dy2 c4746dy2 = (C4746dy2) it.next();
            String str5 = c4746dy2.a;
            z = true;
            String str6 = c4746dy2.d;
            String str7 = c4746dy2.c;
            String str8 = c4746dy2.b;
            if ((str5 == null || str5.equals(str)) && (str8 == null || str8.equals(str2)) && ((str7 == null || str7.equals(str3)) && (str6 == null || str6.equals(str4)))) {
                float f = c4746dy2.e;
                float f2 = c4746dy2.f;
                String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f", c4746dy2.a, str8, str7, str6, Float.valueOf(f), Float.valueOf(f2));
                display$DisplayParams2.setXPpi(f);
                display$DisplayParams2.setYPpi(f2);
                break;
            }
        }
        if (!z) {
            return null;
        }
        if (!"samsung".equals(Build.MANUFACTURER)) {
            return display$DisplayParams2;
        }
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics c = AbstractC5729gq0.c(defaultDisplay);
        int i2 = c.widthPixels;
        ArrayList arrayList2 = AbstractC5090ey2.a;
        if (arrayList2 == null) {
            AbstractC5090ey2.a = new ArrayList();
            Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
            if (supportedModes != null) {
                for (Display.Mode mode : supportedModes) {
                    AbstractC5090ey2.a.add(new Size(mode.getPhysicalWidth(), mode.getPhysicalHeight()));
                }
            }
            arrayList2 = AbstractC5090ey2.a;
        }
        if (arrayList2 == null) {
            return display$DisplayParams2;
        }
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Size size2 = (Size) obj;
            i2 = Math.max(i2, Math.max(size2.getWidth(), size2.getHeight()));
        }
        int i3 = c.widthPixels;
        if (i3 == i2) {
            return display$DisplayParams2;
        }
        float f3 = i3 / i2;
        StringBuilder sb = new StringBuilder(61);
        sb.append("Non-native screen resolution; scaling DPI by: ");
        sb.append(f3);
        Log.i("ey2", sb.toString());
        display$DisplayParams2.setXPpi(display$DisplayParams2.getXPpi() * f3);
        display$DisplayParams2.setYPpi(display$DisplayParams2.getYPpi() * f3);
        return display$DisplayParams2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    @Override // defpackage.Qi4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "current_device_params"
            java.lang.String r2 = "S20"
            if (r7 != 0) goto L3f
            java.io.File r7 = defpackage.S20.a(r1)     // Catch: java.lang.IllegalStateException -> L18
            boolean r1 = r7.exists()     // Catch: java.lang.IllegalStateException -> L18
            if (r1 == 0) goto L16
            boolean r0 = r7.delete()     // Catch: java.lang.IllegalStateException -> L18
            goto L37
        L16:
            r0 = 1
            goto L37
        L18:
            r7 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r1 = r7.length()
            int r1 = r1 + 34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Error clearing device parameters: "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r2, r7)
        L37:
            if (r0 != 0) goto L3e
            java.lang.String r7 = "Could not clear Cardboard parameters from external storage."
            android.util.Log.e(r2, r7)
        L3e:
            return r0
        L3f:
            int r3 = defpackage.S20.a
            r3 = 0
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L60 java.lang.IllegalStateException -> L62 java.io.FileNotFoundException -> L87
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.lang.IllegalStateException -> L62 java.io.FileNotFoundException -> L87
            java.io.File r1 = defpackage.S20.a(r1)     // Catch: java.lang.Throwable -> L60 java.lang.IllegalStateException -> L62 java.io.FileNotFoundException -> L87
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.lang.IllegalStateException -> L62 java.io.FileNotFoundException -> L87
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L60 java.lang.IllegalStateException -> L62 java.io.FileNotFoundException -> L87
            boolean r0 = defpackage.S20.d(r7, r4)     // Catch: java.lang.Throwable -> L58 java.lang.IllegalStateException -> L5a java.io.FileNotFoundException -> L5d
            r4.close()     // Catch: java.io.IOException -> Lab
            goto Lab
        L58:
            r7 = move-exception
            goto Lb4
        L5a:
            r7 = move-exception
            r3 = r4
            goto L63
        L5d:
            r7 = move-exception
            r3 = r4
            goto L88
        L60:
            r7 = move-exception
            goto Lb3
        L62:
            r7 = move-exception
        L63:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L60
            int r1 = r7.length()     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "Error writing parameters: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L60
            r4.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L60
            android.util.Log.w(r2, r7)     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto Lab
            r3.close()     // Catch: java.io.IOException -> Lab
            goto Lab
        L87:
            r7 = move-exception
        L88:
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L60
            int r1 = r7.length()     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = "Parameters file not found for writing: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L60
            r4.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L60
            android.util.Log.e(r2, r7)     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto Lab
            r3.close()     // Catch: java.io.IOException -> Lab
        Lab:
            if (r0 != 0) goto Lb2
            java.lang.String r7 = "Could not write Cardboard parameters to external storage."
            android.util.Log.e(r2, r7)
        Lb2:
            return r0
        Lb3:
            r4 = r3
        Lb4:
            if (r4 == 0) goto Lb9
            r4.close()     // Catch: java.io.IOException -> Lb9
        Lb9:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9559rz1.e(com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams):boolean");
    }
}
