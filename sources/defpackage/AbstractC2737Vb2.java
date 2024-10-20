package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2737Vb2 {
    public final AbstractC2997Xb2 a;
    public boolean b;
    public ON2 c;
    public long d;
    public long e;
    public long f;
    public String g;
    public C2607Ub2 h;
    public boolean i;
    public int j;

    public final XN2 f() {
        AbstractC2997Xb2 abstractC2997Xb2 = this.a;
        if (abstractC2997Xb2.a == null) {
            abstractC2997Xb2.a = AppHooks.get().n();
        }
        return abstractC2997Xb2.a;
    }

    public final C2607Ub2 e(long j, String str, ON2 on2, long j2) {
        try {
            long max = on2.b ? -1L : Math.max(0L, (j - j2) / 86400000);
            XN2 f = f();
            Context context = this.a.c;
            String str2 = AbstractC6547jD.a.e;
            C2607Ub2 c2607Ub2 = this.h;
            String a = f.a(str, str2, max, c2607Ub2 == null ? -2 : c2607Ub2.c, on2);
            AbstractC4851eH1.d("omaha", "OmahaBase::generateAndPostRequest(): Sending request to Omaha:\n" + a, new Object[0]);
            String i = i(j, a);
            AbstractC4851eH1.d("omaha", "OmahaBase::generateAndPostRequest(): Received response from Omaha:\n" + i, new Object[0]);
            f().getClass();
            return new KP2(DeviceFormFactor.isTablet() ? "{2CF1098E-ED43-4590-9F52-CCF831BFB480}" : "{387E11AD-7109-45F6-83CF-CAA241ADC9DF}", on2.b).b(i);
        } catch (UN2 e) {
            AbstractC4851eH1.a("omaha", "Failed to contact server: ", e);
            this.j = e.a;
            return null;
        }
    }

    public final void h(boolean z) {
        HF0 hf0 = this.a.b;
        if (!z) {
            this.e = hf0.a();
            Context context = hf0.a;
            context.getSharedPreferences("com.google.android.apps.chrome.omaha", 0).edit().putInt("backoffFailedAttempts", context.getSharedPreferences("com.google.android.apps.chrome.omaha", 0).getInt("backoffFailedAttempts", 0) + 1).apply();
            return;
        }
        this.c = null;
        hf0.a.getSharedPreferences("com.google.android.apps.chrome.omaha", 0).edit().putInt("backoffFailedAttempts", 0).apply();
        this.f = System.currentTimeMillis() + 18000000;
        this.e = hf0.a();
        AbstractC4851eH1.d("omaha", "Request to Server Successful. Timestamp for next request:" + this.e, new Object[0]);
    }

    public final String i(long j, String str) {
        new C5463g32("omaha_client_android_uc");
        try {
            f().getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://update.googleapis.com/service/update2").openConnection();
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(60000);
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setFixedLengthStreamingMode(AbstractC9771sd.b(str).length);
                if (this.i && this.a.b.a.getSharedPreferences("com.google.android.apps.chrome.omaha", 0).getInt("backoffFailedAttempts", 0) > 0) {
                    httpURLConnection.addRequestProperty("X-RequestAge", Long.toString((j - this.c.a) / 1000));
                }
                return k(httpURLConnection, str);
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            throw new UN2(11, "Failed to open connection to URL", e);
        }
    }

    public static SharedPreferences g() {
        return V60.a.getSharedPreferences("com.google.android.apps.chrome.omaha", 0);
    }

    public AbstractC2737Vb2(C3585ac2 c3585ac2) {
        this.a = c3585ac2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2737Vb2.j():void");
    }

    public static String k(HttpURLConnection httpURLConnection, String str) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new BufferedOutputStream(httpURLConnection.getOutputStream()));
            outputStreamWriter.write(str, 0, str.length());
            AbstractC2663Um3.a(outputStreamWriter);
            d(httpURLConnection);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            d(httpURLConnection);
                            return sb.toString();
                        }
                    }
                } finally {
                    AbstractC2663Um3.a(bufferedReader);
                }
            } catch (IOException e) {
                throw new UN2(11, "Failed when reading response from server: ", e);
            }
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException | SecurityException e2) {
            throw new UN2(11, "Failed to write request to server: ", e2);
        }
    }

    public static void d(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() == 200) {
                return;
            }
            throw new UN2("Received " + httpURLConnection.getResponseCode() + " code instead of 200 (OK) from the server.  Aborting.", 0);
        } catch (IOException e) {
            throw new UN2(0, "Failed to read response code from server: ", e);
        }
    }
}
