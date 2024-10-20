package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.common.logging.nano.Vr$VREvent$SdkConfigurationParams;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.Preferences$UserPrefs;
import com.google.vr.sdk.proto.nano.SdkConfiguration$SdkConfigurationRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class G50 implements Qi4 {
    public final ContentProviderClient a;
    public final Uri b;
    public final Uri c;
    public final Uri d;
    public final Uri e;

    public G50(ContentProviderClient contentProviderClient, String str) {
        if (contentProviderClient == null) {
            throw new IllegalArgumentException("ContentProviderClient must not be null");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Authority key must be non-null and non-empty");
        }
        this.a = contentProviderClient;
        this.b = Ui4.a(str, "device_params");
        this.c = Ui4.a(str, "user_prefs");
        this.d = Ui4.a(str, "phone_params");
        this.e = Ui4.a(str, "sdk_configuration_params");
    }

    @Override // defpackage.Qi4
    public final CardboardDevice$DeviceParams a() {
        return (CardboardDevice$DeviceParams) f(new CardboardDevice$DeviceParams(), this.b, null);
    }

    @Override // defpackage.Qi4
    public final Display$DisplayParams c() {
        return (Display$DisplayParams) f(new Display$DisplayParams(), this.d, null);
    }

    @Override // defpackage.Qi4
    public final Vr$VREvent$SdkConfigurationParams b(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return (Vr$VREvent$SdkConfigurationParams) f(SdkConfigurationReader.DEFAULT_PARAMS, this.e, Base64.encodeToString(AbstractC8015nV1.toByteArray(sdkConfiguration$SdkConfigurationRequest), 0));
    }

    @Override // defpackage.Qi4
    public final Preferences$UserPrefs d() {
        return (Preferences$UserPrefs) f(new Preferences$UserPrefs(), this.c, null);
    }

    @Override // defpackage.Qi4
    public final void close() {
        this.a.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC8015nV1 f(defpackage.RF0 r9, android.net.Uri r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = "G50"
            r1 = 0
            android.content.ContentProviderClient r2 = r8.a     // Catch: java.lang.Throwable -> L58 android.os.RemoteException -> L5a java.lang.IllegalArgumentException -> L5c android.database.CursorIndexOutOfBoundsException -> L5e defpackage.C1257Jr1 -> L60
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r10
            r5 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L58 android.os.RemoteException -> L5a java.lang.IllegalArgumentException -> L5c android.database.CursorIndexOutOfBoundsException -> L5e defpackage.C1257Jr1 -> L60
            if (r11 == 0) goto L29
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            if (r2 == 0) goto L29
            r10 = 0
            byte[] r10 = r11.getBlob(r10)     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            if (r10 != 0) goto L21
            r11.close()
            return r1
        L21:
            nV1 r9 = defpackage.AbstractC8015nV1.mergeFrom(r9, r10)     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            r11.close()
            return r9
        L29:
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            int r10 = r10 + 50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            java.lang.String r10 = "Invalid params result from ContentProvider query: "
            r2.append(r10)     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            r2.append(r9)     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            android.util.Log.e(r0, r9)     // Catch: java.lang.Throwable -> L4d android.os.RemoteException -> L50 java.lang.IllegalArgumentException -> L52 android.database.CursorIndexOutOfBoundsException -> L54 defpackage.C1257Jr1 -> L56
            if (r11 == 0) goto L4c
            r11.close()
        L4c:
            return r1
        L4d:
            r9 = move-exception
            r1 = r11
            goto L6d
        L50:
            r9 = move-exception
            goto L62
        L52:
            r9 = move-exception
            goto L62
        L54:
            r9 = move-exception
            goto L62
        L56:
            r9 = move-exception
            goto L62
        L58:
            r9 = move-exception
            goto L6d
        L5a:
            r9 = move-exception
            goto L61
        L5c:
            r9 = move-exception
            goto L61
        L5e:
            r9 = move-exception
            goto L61
        L60:
            r9 = move-exception
        L61:
            r11 = r1
        L62:
            java.lang.String r10 = "Error reading params from ContentProvider"
            android.util.Log.e(r0, r10, r9)     // Catch: java.lang.Throwable -> L4d
            if (r11 == 0) goto L6c
            r11.close()
        L6c:
            return r1
        L6d:
            if (r1 == 0) goto L72
            r1.close()
        L72:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.G50.f(RF0, android.net.Uri, java.lang.String):nV1");
    }

    @Override // defpackage.Qi4
    public final boolean e(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        int update;
        Uri uri = this.b;
        ContentProviderClient contentProviderClient = this.a;
        try {
            if (cardboardDevice$DeviceParams == null) {
                update = contentProviderClient.delete(uri, null, null);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", AbstractC8015nV1.toByteArray(cardboardDevice$DeviceParams));
                update = contentProviderClient.update(uri, contentValues, null, null);
            }
            return update > 0;
        } catch (RemoteException e) {
            Log.e("G50", "Failed to write params to ContentProvider", e);
            return false;
        } catch (SecurityException e2) {
            Log.e("G50", "Insufficient permissions to write params to ContentProvider", e2);
            return false;
        }
    }
}
