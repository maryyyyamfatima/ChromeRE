package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.StrictMode;
import java.io.IOException;
import java.net.Socket;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K22 {
    public final ConnectivityManager a;

    public final Network b() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.a;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            return activeNetwork;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        for (Network network : a.c(this, null)) {
            try {
                try {
                    networkInfo = connectivityManager.getNetworkInfo(network);
                } catch (NullPointerException unused) {
                    networkInfo = null;
                }
            } catch (NullPointerException unused2) {
                networkInfo = connectivityManager.getNetworkInfo(network);
            }
            if (networkInfo != null && (networkInfo.getType() == activeNetworkInfo.getType() || networkInfo.getType() == 17)) {
                activeNetwork = network;
            }
        }
        return activeNetwork;
    }

    public K22(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final NetworkInfo d(Network network) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = this.a;
        try {
            try {
                networkInfo = connectivityManager.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                networkInfo = connectivityManager.getNetworkInfo(network);
            }
        } catch (NullPointerException unused2) {
            networkInfo = null;
        }
        return (networkInfo == null || networkInfo.getType() != 17) ? networkInfo : connectivityManager.getActiveNetworkInfo();
    }

    public final int a(Network network) {
        NetworkInfo d = d(network);
        if (d == null || !d.isConnected()) {
            return 6;
        }
        return a.a(d.getType(), d.getSubtype());
    }

    public static boolean e(Network network) {
        Socket socket = new Socket();
        try {
            try {
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                try {
                    network.bindSocket(socket);
                    if (vmPolicy != null) {
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    try {
                        socket.close();
                        return true;
                    } catch (IOException unused) {
                        return true;
                    }
                } catch (Throwable th) {
                    if (vmPolicy != null) {
                        try {
                            StrictMode.setVmPolicy(vmPolicy);
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                socket.close();
                return false;
            } catch (Throwable th2) {
                try {
                    socket.close();
                } catch (IOException unused4) {
                }
                throw th2;
            }
        } catch (IOException unused5) {
            return false;
        }
    }

    public final NetworkCapabilities c(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return this.a.getNetworkCapabilities(network);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }
}
