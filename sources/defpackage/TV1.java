package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class TV1 {
    public static String a(int i) {
        switch (i) {
            case 0:
                return "InvalidMessage";
            case 1:
                return "SavePassword";
            case 2:
                return "UpdatePassword";
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return "GeneratedPasswordSaved";
            case 4:
                return "PopupBlocked";
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return "SafetyTip";
            case 6:
                return "SaveAddressProfile";
            case 7:
                return "MerchantTrust";
            case 8:
                return "AddToHomescreenIPH";
            case 9:
                return "SendTabToSelf";
            case 10:
                return "ReaderMode";
            case 11:
                return "ChromeSurvey";
            case 12:
                return "SaveCard";
            case 13:
                return "NotificationBlocked";
            case 14:
                return "PermissionUpdate";
            case 15:
                return "AdsBlocked";
            case 16:
                return "DownloadProgress";
            case 17:
                return "SyncError";
            case 18:
                return "SharedHighlighting";
            case 19:
                return "NearOomReduction";
            case 20:
                return "InstallableAmbientBadge";
            case 21:
                return "AutoDarkWebContents";
            case 22:
                return "TestMessage";
            case 23:
                return "TailoredSecurityEnabled";
            case 24:
                return "VrServicesUpgrade";
            case 25:
                return "TailoredSecurityDisabled";
            case 26:
                return "ArCoreUpgrade";
            case 27:
                return "InstantApps";
            case 28:
                return "AboutThisSite";
            case 29:
                return "Translate";
            case 30:
                return "OfferNotification";
            case 31:
                return "ExternalNavigation";
            case 32:
                return "FramebustBlocked";
            default:
                return "Unknown";
        }
    }
}
