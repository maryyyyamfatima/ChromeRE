package org.chromium.components.permissions;

import J.N;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AbstractC11140wc2;
import defpackage.AbstractC3899bX;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9108qg3;
import defpackage.C11055wM;
import defpackage.C11578xs1;
import defpackage.C11674y84;
import defpackage.C11997z52;
import defpackage.C12264zs1;
import defpackage.C8765pg3;
import defpackage.C9215qz;
import defpackage.InterfaceC0218Br2;
import defpackage.InterfaceC11921ys1;
import defpackage.RG1;
import defpackage.Y50;
import org.chromium.base.Callback;
import org.chromium.components.permissions.BluetoothChooserDialog;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BluetoothChooserDialog implements InterfaceC11921ys1, InterfaceC0218Br2 {
    public final WindowAndroid a;
    public final Activity b;
    public final Context c;
    public C12264zs1 d;
    public final String e;
    public final int f;
    public final BluetoothChooserAndroidDelegate g;
    public final C11674y84 h;
    public final String i;
    public final Drawable[] j;
    public long k;
    public boolean l;
    public final BluetoothAdapter m;
    public final SpannableString n;
    public boolean o;
    public final C9215qz p = new C9215qz(this);

    public BluetoothChooserDialog(WindowAndroid windowAndroid, String str, int i, BluetoothChooserAndroidDelegate bluetoothChooserAndroidDelegate, long j) {
        this.a = windowAndroid;
        this.b = (Activity) windowAndroid.k().get();
        Context context = (Context) windowAndroid.j.get();
        this.c = context;
        this.e = str;
        this.f = i;
        this.g = bluetoothChooserAndroidDelegate;
        this.k = j;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.m = defaultAdapter;
        this.h = g(R.drawable.0_resource_name_obfuscated_res_0x7f0901c9);
        this.i = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14027d);
        this.j = new Drawable[]{g(R.drawable.0_resource_name_obfuscated_res_0x7f090318), g(R.drawable.0_resource_name_obfuscated_res_0x7f090319), g(R.drawable.0_resource_name_obfuscated_res_0x7f09031a), g(R.drawable.0_resource_name_obfuscated_res_0x7f09031b), g(R.drawable.0_resource_name_obfuscated_res_0x7f09031c)};
        if (defaultAdapter == null) {
            AbstractC4851eH1.d("Bluetooth", "BluetoothChooserDialog: Default Bluetooth adapter not found.", new Object[0]);
        }
        this.n = AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14027b), new C8765pg3(e(2), "<link>", "</link>"));
    }

    public final C11674y84 g(int i) {
        Context context = this.c;
        C11674y84 b = C11674y84.b(context.getResources(), i, context.getTheme());
        b.setTintList(Y50.b(context, R.color.0_resource_name_obfuscated_res_0x7f0705b6));
        return b;
    }

    public final void f(int i, String str) {
        if (this.l) {
            this.b.unregisterReceiver(this.p);
            this.l = false;
        }
        long j = this.k;
        if (j != 0) {
            N.Mv9CbWE_(j, i, str);
        }
    }

    @Override // defpackage.InterfaceC11921ys1
    public final void a(String str) {
        if (str.isEmpty()) {
            f(1, "");
        } else {
            f(2, str);
        }
    }

    @Override // defpackage.InterfaceC0218Br2
    public final void b(int[] iArr, String[] strArr) {
        if (this.k != 0 && d()) {
            C12264zs1 c12264zs1 = this.d;
            c12264zs1.k.clear();
            c12264zs1.b(1);
            if (this.o) {
                notifyAdapterTurnedOff();
            } else {
                N.MsAog9yr(this.k);
            }
        }
    }

    public final boolean d() {
        SpannableString a;
        WindowAndroid windowAndroid = this.a;
        boolean h = h(windowAndroid);
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 31 ? !RG1.b().d() : false;
        if (!h && !c(windowAndroid)) {
            f(0, "");
            return false;
        }
        C8765pg3 c8765pg3 = new C8765pg3(e(3), "<permission_link>", "</permission_link>");
        C8765pg3 c8765pg32 = new C8765pg3(e(4), "<services_link>", "</services_link>");
        Context context = this.c;
        if (h) {
            if (!z) {
                return true;
            }
            a = AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140282), c8765pg32);
        } else if (z) {
            a = AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140280), c8765pg3, c8765pg32);
        } else if (i >= 31) {
            a = AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140283), c8765pg3);
        } else {
            a = AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14027f), c8765pg3);
        }
        this.d.a(a, AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140281), new C8765pg3(e(5), "<link>", "</link>")));
        return false;
    }

    public final C11997z52 e(final int i) {
        return new C11997z52(this.c, new Callback() { // from class: pz
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                View view = (View) obj;
                BluetoothChooserDialog bluetoothChooserDialog = BluetoothChooserDialog.this;
                long j = bluetoothChooserDialog.k;
                if (j == 0) {
                    return;
                }
                switch (i) {
                    case 0:
                        N.MNZ4441F(j);
                        break;
                    case 1:
                        BluetoothAdapter bluetoothAdapter = bluetoothChooserDialog.m;
                        if (bluetoothAdapter != null && bluetoothAdapter.enable()) {
                            bluetoothChooserDialog.d.b(0);
                            break;
                        } else {
                            bluetoothChooserDialog.d.a(bluetoothChooserDialog.c.getString(R.string.0_resource_name_obfuscated_res_0x7f14028e), bluetoothChooserDialog.n);
                            break;
                        }
                        break;
                    case 2:
                        N.Myj$17aV(j);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        bluetoothChooserDialog.d.l = true;
                        int i2 = Build.VERSION.SDK_INT;
                        WindowAndroid windowAndroid = bluetoothChooserDialog.a;
                        if (i2 >= 31) {
                            windowAndroid.b(new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, bluetoothChooserDialog);
                            break;
                        } else {
                            windowAndroid.b(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, bluetoothChooserDialog);
                            break;
                        }
                    case 4:
                        bluetoothChooserDialog.d.l = true;
                        bluetoothChooserDialog.b.startActivity(RG1.b().c());
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        N.M7w2qGR3(j);
                        break;
                    case 6:
                        C12264zs1 c12264zs1 = bluetoothChooserDialog.d;
                        c12264zs1.k.clear();
                        c12264zs1.b(1);
                        N.MsAog9yr(bluetoothChooserDialog.k);
                        break;
                }
                view.invalidate();
            }
        });
    }

    public static boolean h(WindowAndroid windowAndroid) {
        if (Build.VERSION.SDK_INT >= 31) {
            return windowAndroid.hasPermission("android.permission.BLUETOOTH_SCAN") && windowAndroid.hasPermission("android.permission.BLUETOOTH_CONNECT");
        }
        return windowAndroid.hasPermission("android.permission.ACCESS_FINE_LOCATION");
    }

    public static boolean c(WindowAndroid windowAndroid) {
        if (Build.VERSION.SDK_INT >= 31) {
            return windowAndroid.canRequestPermission("android.permission.BLUETOOTH_SCAN") && windowAndroid.canRequestPermission("android.permission.BLUETOOTH_CONNECT");
        }
        return windowAndroid.canRequestPermission("android.permission.ACCESS_FINE_LOCATION");
    }

    public static BluetoothChooserDialog create(WindowAndroid windowAndroid, String str, int i, BluetoothChooserAndroidDelegate bluetoothChooserAndroidDelegate, long j) {
        if (!h(windowAndroid) && !c(windowAndroid)) {
            return null;
        }
        BluetoothChooserDialog bluetoothChooserDialog = new BluetoothChooserDialog(windowAndroid, str, i, bluetoothChooserAndroidDelegate, j);
        String str2 = bluetoothChooserDialog.e;
        SpannableString spannableString = new SpannableString(str2);
        Context context = bluetoothChooserDialog.c;
        boolean z = !AbstractC3899bX.e(context);
        C11055wM a = bluetoothChooserDialog.g.a();
        AbstractC11140wc2.a(spannableString, bluetoothChooserDialog.c, a, bluetoothChooserDialog.f, false, z, true);
        a.a();
        SpannableString spannableString2 = new SpannableString(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14027e, str2));
        TextUtils.copySpansFrom(spannableString, 0, spannableString.length(), Object.class, spannableString2, spannableString2.toString().indexOf(str2));
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140284);
        SpannableString a2 = AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f14028d), new C8765pg3(bluetoothChooserDialog.e(0), "<link>", "</link>"));
        String string2 = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14027c);
        SpannableString a3 = AbstractC9108qg3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140285), new C8765pg3(bluetoothChooserDialog.e(0), "<link1>", "</link1>"), new C8765pg3(bluetoothChooserDialog.e(6), "<link2>", "</link2>"));
        C11578xs1 c11578xs1 = new C11578xs1(spannableString2, a2, string, a2, a3, a3, string2);
        Activity activity = bluetoothChooserDialog.b;
        bluetoothChooserDialog.d = new C12264zs1(context, activity.getWindow(), bluetoothChooserDialog, c11578xs1);
        activity.registerReceiver(bluetoothChooserDialog.p, new IntentFilter("android.location.MODE_CHANGED"));
        bluetoothChooserDialog.l = true;
        return bluetoothChooserDialog;
    }

    public void addOrUpdateDevice(String str, String str2, boolean z, int i) {
        Drawable drawable;
        String str3;
        if (z) {
            drawable = this.h.getConstantState().newDrawable();
            str3 = this.i;
        } else if (i != -1) {
            drawable = this.j[i].getConstantState().newDrawable();
            str3 = this.c.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120036, i, Integer.valueOf(i));
        } else {
            drawable = null;
            str3 = null;
        }
        C12264zs1 c12264zs1 = this.d;
        c12264zs1.f.setVisibility(8);
        c12264zs1.k.a(drawable, str, str2, str3);
        c12264zs1.b(2);
    }

    public void closeDialog() {
        this.k = 0L;
        this.d.c.dismiss();
    }

    public void notifyAdapterTurnedOff() {
        this.o = true;
        if (d()) {
            this.d.a(AbstractC9108qg3.a(this.c.getString(R.string.0_resource_name_obfuscated_res_0x7f14027a), new C8765pg3(e(1), "<link>", "</link>")), this.n);
        }
    }

    public final void notifyAdapterTurnedOn() {
        this.o = false;
        C12264zs1 c12264zs1 = this.d;
        c12264zs1.k.clear();
        c12264zs1.b(1);
    }

    public void notifyDiscoveryState(int i) {
        if (i == 0) {
            d();
        } else {
            if (i != 2) {
                return;
            }
            C12264zs1 c12264zs1 = this.d;
            c12264zs1.f.setVisibility(8);
            c12264zs1.b(3);
        }
    }
}
