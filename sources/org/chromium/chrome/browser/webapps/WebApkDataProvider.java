package org.chromium.chrome.browser.webapps;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.StrictMode;
import defpackage.AbstractC3641al4;
import defpackage.AbstractC7071kk4;
import defpackage.AbstractC9552ry;
import defpackage.AbstractC9942t6;
import defpackage.Kn4;
import defpackage.MW;
import defpackage.PC;
import defpackage.V60;
import defpackage.Vj4;
import java.util.ArrayList;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebApkDataProvider {
    public static String a(long j) {
        return String.format("#%02X%02X%02X", Long.valueOf((j >> 16) & 255), Long.valueOf((j >> 8) & 255), Long.valueOf((j >> 0) & 255));
    }

    public static String[] getOfflinePageInfo(int[] iArr, String str, WebContents webContents) {
        Vj4 vj4;
        PC pc;
        Activity a = AbstractC9942t6.a(webContents);
        if (a instanceof CustomTabActivity) {
            CustomTabActivity customTabActivity = (CustomTabActivity) a;
            if (customTabActivity.U1() && (pc = customTabActivity.T0) != null) {
                MW j = pc.j();
                String g = pc.g();
                if (j != null && g != null) {
                    vj4 = new Vj4();
                    vj4.c = j.e();
                    vj4.d = j.d();
                    PackageManager packageManager = V60.a.getPackageManager();
                    try {
                        vj4.a = packageManager.getApplicationLabel(packageManager.getApplicationInfo(g, 128)).toString();
                        Drawable applicationIcon = packageManager.getApplicationIcon(g);
                        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitCustomSlowCalls().build());
                        try {
                            vj4.b = AbstractC9552ry.a(createBitmap);
                            if (threadPolicy != null) {
                                StrictMode.setThreadPolicy(threadPolicy);
                            }
                        } catch (Throwable th) {
                            if (threadPolicy != null) {
                                try {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
            }
            vj4 = null;
        } else {
            Kn4 c = Kn4.c(AbstractC7071kk4.b(new Intent(), AbstractC3641al4.d(V60.a, str), "", 0, false, false, null, null));
            if (c != null) {
                vj4 = new Vj4();
                vj4.a = c.p();
                StrictMode.ThreadPolicy threadPolicy2 = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy2).permitCustomSlowCalls().build());
                try {
                    vj4.b = c.g().b();
                    if (threadPolicy2 != null) {
                        StrictMode.setThreadPolicy(threadPolicy2);
                    }
                    vj4.c = c.f().j == null ? c.f().k : r13.intValue();
                    vj4.d = c.r();
                } catch (Throwable th2) {
                    if (threadPolicy2 != null) {
                        try {
                            StrictMode.setThreadPolicy(threadPolicy2);
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
            vj4 = null;
        }
        if (vj4 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i == 0) {
                arrayList.add(vj4.a);
            } else if (i == 1) {
                arrayList.add("data:image/png;base64," + vj4.b);
            } else if (i == 2) {
                arrayList.add(a(vj4.c));
            } else if (i != 3) {
                if (i == 4) {
                    long j2 = vj4.d;
                    arrayList.add(j2 != 2147483648L ? a(j2) : "");
                } else if (i != 5) {
                    arrayList.add("No such field: " + i);
                } else {
                    long j3 = vj4.d;
                    arrayList.add(j3 != 2147483648L ? a(j3) : "");
                }
            } else {
                arrayList.add(a(vj4.c));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
