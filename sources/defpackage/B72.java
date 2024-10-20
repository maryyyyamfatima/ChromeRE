package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge;
import org.chromium.webapk.lib.runtime_library.IWebApkApi;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B72 implements UX3 {
    public boolean a;
    public final /* synthetic */ C1193Je2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C72 e;

    public B72(C72 c72, C1193Je2 c1193Je2, long j, String str) {
        this.e = c72;
        this.b = c1193Je2;
        this.c = j;
        this.d = str;
    }

    @Override // defpackage.UX3
    public final void b(ComponentName componentName, int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        EI2.h(i, 6, "TrustedWebActivity.Notification.PermissionRequestResult");
        this.e.a(this.b, this.c, componentName.getPackageName(), i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [A72] */
    @Override // defpackage.UX3
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        final C1193Je2 c1193Je2 = this.b;
        final long j = this.c;
        final ?? r0 = new Callback() { // from class: A72
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /* JADX WARN: Type inference failed for: r7v0, types: [w72] */
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                final C1193Je2 c1193Je22 = c1193Je2;
                final long j2 = j;
                final String str = (String) obj;
                final C72 c72 = B72.this.e;
                c72.getClass();
                if (TextUtils.isEmpty(str)) {
                    c72.a.e(5, c1193Je22);
                    InstalledWebappBridge.b(2, j2);
                    return;
                }
                C11876yk4 a = C11876yk4.a();
                final ?? r7 = new Callback() { // from class: w72
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        C1193Je2 c1193Je23 = c1193Je22;
                        long j3 = j2;
                        String str2 = str;
                        Integer num = (Integer) obj2;
                        C72 c722 = C72.this;
                        c722.getClass();
                        EI2.h(num.intValue(), 6, "WebApk.Notification.PermissionRequestResult");
                        c722.a(c1193Je23, j3, str2, num.intValue());
                    }
                };
                a.getClass();
                if (!AbstractC6205iD.a()) {
                    AbstractC4851eH1.f("WebApkServiceClient", "Requesting notification permission is not supported before T.", new Object[0]);
                    return;
                }
                InterfaceC11533xk4 interfaceC11533xk4 = new InterfaceC11533xk4() { // from class: sk4
                    @Override // defpackage.Gk4
                    public final /* synthetic */ void a(IBinder iBinder) {
                        AbstractC11190wk4.a(this, iBinder);
                    }

                    @Override // defpackage.InterfaceC11533xk4
                    public final void b(InterfaceC3952bg1 interfaceC3952bg1) {
                        String string = V60.a.getString(R.string.f90500_resource_name_obfuscated_res_0x7f140bd1);
                        C3276Zf1 c3276Zf1 = (C3276Zf1) interfaceC3952bg1;
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(IWebApkApi.DESCRIPTOR);
                            obtain.writeString(string);
                            obtain.writeString("default_channel_id");
                            c3276Zf1.a.transact(8, obtain, obtain2, 0);
                            obtain2.readException();
                            PendingIntent pendingIntent = (PendingIntent) (obtain2.readInt() != 0 ? PendingIntent.CREATOR.createFromParcel(obtain2) : null);
                            obtain2.recycle();
                            obtain.recycle();
                            final Callback callback = r7;
                            if (pendingIntent == null) {
                                callback.onResult(3);
                                return;
                            }
                            Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: tk4
                                @Override // android.os.Handler.Callback
                                public final boolean handleMessage(Message message) {
                                    int i;
                                    int i2 = message.getData().getInt("permissionStatus", 1);
                                    if (i2 == 0) {
                                        i = 1;
                                    } else {
                                        i = 2;
                                        if (i2 == 2) {
                                            i = 3;
                                        }
                                    }
                                    Callback.this.onResult(Integer.valueOf(i));
                                    return true;
                                }
                            });
                            Intent intent = new Intent();
                            intent.putExtra("messenger", new Messenger(handler));
                            try {
                                pendingIntent.send(V60.a, 0, intent);
                            } catch (PendingIntent.CanceledException e) {
                                AbstractC4851eH1.a("WebApkServiceClient", "The PendingIntent was canceled.", e);
                            }
                        } catch (Throwable th) {
                            obtain2.recycle();
                            obtain.recycle();
                            throw th;
                        }
                    }
                };
                a.a.a(V60.a, str, interfaceC11533xk4);
            }
        };
        this.e.getClass();
        final String d = AbstractC3641al4.d(V60.a, this.d);
        if (d == null) {
            r0.onResult(null);
        } else {
            RR.a(d, new InterfaceC4322ck4() { // from class: v72
                @Override // defpackage.InterfaceC4322ck4
                public final void a(String str, boolean z) {
                    r0.onResult(z ? d : null);
                }
            });
        }
    }
}
