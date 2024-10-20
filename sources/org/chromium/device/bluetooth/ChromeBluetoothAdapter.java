package org.chromium.device.bluetooth;

import J.N;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9076qb1;
import defpackage.MM;
import defpackage.RG1;
import defpackage.Vq4;
import defpackage.Xq4;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ChromeBluetoothAdapter extends BroadcastReceiver {
    public long a;
    public final Wrappers$BluetoothAdapterWrapper b;
    public MM c;

    public ChromeBluetoothAdapter(long j, Wrappers$BluetoothAdapterWrapper wrappers$BluetoothAdapterWrapper) {
        this.a = j;
        this.b = wrappers$BluetoothAdapterWrapper;
        if (wrappers$BluetoothAdapterWrapper != null) {
            wrappers$BluetoothAdapterWrapper.b.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
        if (wrappers$BluetoothAdapterWrapper == null) {
            AbstractC4851eH1.d("Bluetooth", "ChromeBluetoothAdapter created with no adapterWrapper.", new Object[0]);
        } else {
            AbstractC4851eH1.d("Bluetooth", "ChromeBluetoothAdapter created with provided adapterWrapper.", new Object[0]);
        }
    }

    public final void onBluetoothAdapterAndroidDestruction() {
        stopScan();
        this.a = 0L;
        Wrappers$BluetoothAdapterWrapper wrappers$BluetoothAdapterWrapper = this.b;
        if (wrappers$BluetoothAdapterWrapper != null) {
            wrappers$BluetoothAdapterWrapper.b.unregisterReceiver(this);
        }
    }

    public static ChromeBluetoothAdapter create(long j, Wrappers$BluetoothAdapterWrapper wrappers$BluetoothAdapterWrapper) {
        return new ChromeBluetoothAdapter(j, wrappers$BluetoothAdapterWrapper);
    }

    public final String getAddress() {
        return isPresent() ? this.b.a.getAddress() : "";
    }

    public final String getName() {
        return isPresent() ? this.b.a.getName() : "";
    }

    public final boolean isPresent() {
        return this.b != null;
    }

    public final boolean isPowered() {
        return isPresent() && this.b.a.isEnabled();
    }

    public final boolean setPowered(boolean z) {
        Wrappers$BluetoothAdapterWrapper wrappers$BluetoothAdapterWrapper = this.b;
        return z ? isPresent() && wrappers$BluetoothAdapterWrapper.a.enable() : isPresent() && wrappers$BluetoothAdapterWrapper.a.disable();
    }

    public final boolean isDiscoverable() {
        return isPresent() && this.b.a.getScanMode() == 23;
    }

    public final boolean isDiscovering() {
        return isPresent() && (this.b.a.isDiscovering() || this.c != null);
    }

    public final boolean startScan(List list) {
        Vq4 vq4;
        Wrappers$BluetoothAdapterWrapper wrappers$BluetoothAdapterWrapper = this.b;
        BluetoothLeScanner bluetoothLeScanner = wrappers$BluetoothAdapterWrapper.a.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            vq4 = null;
        } else {
            if (wrappers$BluetoothAdapterWrapper.c == null) {
                wrappers$BluetoothAdapterWrapper.c = new Vq4(bluetoothLeScanner);
            }
            vq4 = wrappers$BluetoothAdapterWrapper.c;
        }
        if (vq4 == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        Context context = wrappers$BluetoothAdapterWrapper.b;
        if (!(i < 31 ? RG1.b().d() && (i < 29 ? context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 : context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) : context.checkCallingOrSelfPermission("android.permission.BLUETOOTH_SCAN") == 0 && context.checkCallingOrSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0)) {
            return false;
        }
        MM mm = new MM(this);
        this.c = mm;
        try {
            vq4.a(list, mm);
            return true;
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("Bluetooth", "Cannot start scan: " + e, new Object[0]);
            this.c = null;
            return false;
        } catch (IllegalStateException e2) {
            AbstractC4851eH1.a("Bluetooth", "Adapter is off. Cannot start scan: " + e2, new Object[0]);
            this.c = null;
            return false;
        }
    }

    public final boolean stopScan() {
        Vq4 vq4;
        if (this.c == null) {
            return false;
        }
        try {
            Wrappers$BluetoothAdapterWrapper wrappers$BluetoothAdapterWrapper = this.b;
            BluetoothLeScanner bluetoothLeScanner = wrappers$BluetoothAdapterWrapper.a.getBluetoothLeScanner();
            if (bluetoothLeScanner == null) {
                vq4 = null;
            } else {
                if (wrappers$BluetoothAdapterWrapper.c == null) {
                    wrappers$BluetoothAdapterWrapper.c = new Vq4(bluetoothLeScanner);
                }
                vq4 = wrappers$BluetoothAdapterWrapper.c;
            }
            if (vq4 != null) {
                vq4.a.stopScan((Xq4) vq4.b.remove(this.c));
            }
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("Bluetooth", "Cannot stop scan: " + e, new Object[0]);
        } catch (IllegalStateException e2) {
            AbstractC4851eH1.a("Bluetooth", "Adapter is off. Cannot stop scan: " + e2, new Object[0]);
        }
        this.c = null;
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String a;
        String action = intent.getAction();
        if (isPresent() && "android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            Object[] objArr = new Object[1];
            switch (intExtra) {
                case 10:
                    a = "STATE_OFF";
                    break;
                case 11:
                    a = "STATE_TURNING_ON";
                    break;
                case 12:
                    a = "STATE_ON";
                    break;
                case 13:
                    a = "STATE_TURNING_OFF";
                    break;
                default:
                    a = AbstractC9076qb1.a("illegal state: ", intExtra);
                    break;
            }
            objArr[0] = a;
            AbstractC4851eH1.f("Bluetooth", "onReceive: BluetoothAdapter.ACTION_STATE_CHANGED: %s", objArr);
            if (intExtra == 10) {
                N.MGGbKqrZ(this.a, this, false);
            } else {
                if (intExtra != 12) {
                    return;
                }
                N.MGGbKqrZ(this.a, this, true);
            }
        }
    }
}
