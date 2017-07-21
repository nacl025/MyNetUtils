package stone.com.mynetutils.test;

import android.os.Environment;

/**
 * Created by edmund on 2017/7/21.
 */
public class Env {

    // 功能标识码V1.0
    // public static final int OPERO_UID_GET = 1; // UID获取标识码
    // // public static final int OPERO_USER_GET = 2; // 用户信息获取标识码
    // // public static final int OPERO_INIT_DEVICE = 3; // 设备初始化标识码
    // // public static final int OPERO_CIRCLE_OPER_GET = 4; // 周期操作策略获取标识码
    // // public static final int OPERO_STRA_APPLI_GET = 5; // 应用策略获取标识码
    // public static final int OPERO_STRA_BACK_GET = 6; // 备份策略获取标识码
    // public static final int OPERO_REMOTE_CON = 7; // 远程控制标识码
    // // public static final int OPERO_DEVICE_UPDATE = 8; // 设备变更标识码
    // // public static final int OPERO_DEVICE_LOCATION = 9; // 设备定位标识码
    // public static final int OPERO_RECOVER_DATE = 10; // 还原数据标识码
    // public static final int OPERO_RECOVER_DATA_VERSION = 11; // 还原数据版本标识码
    // public static final int OPERO_BACKUP_STRA = 12; // 策略备份标识码
    // public static final int OPERO_BACKUP_DATA = 13; // 数据备份标识码
    // // public static final int OPERO_APPLI_WARNI = 14; // 应用报警标识码
    // public static final int OPERO_OPERATE_OK = 15; // 操作成功确认码
    // public static final int OPERO_SUSER_UPDATE = 16; // 服务器用户信息变更标识码
    // public static final int OPERO_CUSER_UPDATE = 17; // 客户端用户信息变更
    // // public static final int OPERO_ONNET = 18; // 联网操作
    // public static final int OPERO_CLOUND_SCAN = 19; // 云查杀操作
    // public static final int OPERO_USER_INPUT = 101; // 输入用户名密码标识码
    // 功能标识码V2.0
    public static final int OPERO_APP_LIST_GET = 1001;// 获取应用列表
    public static final int OPERO_APP_DETAIL_GET = 1002;// 获取应用详情
    public static final int OPERO_APP_CLASS_GET = 1003;// 应用分类
    public static final int OPERO_MINE_APP_LIST_GET = 1004;// 获取我的应用列表
    public static final int OPERO_UPDATA_APP = 1005;// 安装/更新应用
    public static final int OPERO_UNINSTALL_ALL = 1006;// 卸载应用
    public static final int OPERO_UPDATA_NOTIFY = 1007;// Android安装/更新后通知
    public static final int OPERO_UPDATA_ALL_NOTIFY = 1008;// 全部更新后

    public static final int OPERO_USER_GET = 3001; // 用户信息获取标识码
    public static final int OPERO_INIT_DEVICE = 3101; // 设备初始化标识码
    public static final int OPERO_DEVICE_GET = 3002; // 查询设备信息
    public static final int OPERO_DEVICE_BATTERY = 3003; // 上传电池信息
    public static final int OPERO_DEVICE_NET_TRAFFIC = 3004; // 上传网络流量信息标识码
    public static final int OPERO_DEVICE_LOCATION = 3005; // 设备定位标识码
    public static final int OPERO_DEVICE_JAILED = 3006; // 上传root信息
    public static final int OPERO_UPLOAD_TOKEN = 3010;// 上传HPNS TOKEN
    public static final int OPERO_GET_PUSH_CONTENT = 3333;// 获得Push内容
    public static final int OPERO_DEVICE_UPDATE = 3102; // 设备变更标识码
    public static final int OPERO_APP_LIST = 3103; // push注册成功后下发强制安装应用
    // public static final int OPERO_DEVICE_CONFIG = 3104; // 下发设备配置
    public static final int OPERO_STRA_APPLI_GET = 3105; // 黑名单
    public static final int OPERO_PUSH_RESULT = 9; // 2.13 push返回状态
    public static final int OPERO_UPLOAD_APP_LIST = 3107; // 上传应用列表
    public static final int OPERO_DEVICE_ADMIN = 3108;// 上传设备管理状态
    public static final int OPERO_CIRCLE_OPER_GET = 3110; // 周期操作策略获取标识码
    public static final int OPERO_ONNET = 3111; // 联网操作
    public static final int OPERO_APPLI_WARNI = 3112; // 应用报警标识码
    public static final int OPERO_POLICY_LIST_GET = 3114; // 上传策略列表
    public static final int OPERO_CLIENT_UPGRAD = 3115; // 获取客户端最新版本信息
    public static final int OPER_REPORT_VIOLATION = 3117;
    public static final int OPER_REPORT_VIOLATION_PROCESS = 3118;

    // 流量上传，平安定制
    public static final int OPERO_NET_TRAFFIC_LIST = 3501;

    public static final int OPERO_GET_MSG = 4010;
    public static final int OPERO_OPER_MSG = 4011;
    public static final int OPERO_UPLOAD_FILE_LIST = 3701; // 上传应用列表

    public static final int OPERO_ADD_REG_CODE = 3702;
    public static final int OPERO_DEL_REG_CODE = 3703;

    public static final int OPERO_UPLOAD_LOC_PATH = 3704;

    // 安管平台下发协议结果状态
    public static final int OPERR_SUCESS = 1; // 1 当次操作执行成功 所有功能码有效
    public static final int OPERR_FAIL = 2; // 当次操作执行失败 所有功能码有效
    // public static final int OPERR_UID_GET_MATCH_NO_GUARD_PWD = 3; //
    // 用户名和密码与设备已匹配，防盗密码缺失,针对UIDGet功能码
    // public static final int OPERR_UID_GET_MATCH_EXIST_GUARD_PWD = 4; //
    // 用户名和密码与设备已匹配，服务器存在防盗密码，和客户端不匹配，针对UIDGet功能码
    public static final int OPERR_UID_GET_NO_MATCH_PWD = 3;// 用户名和密码不匹配
    public static final int OPERR_UID_GET_NO_MATCH = 4; // 用户名和密码与设备不匹配
    public static final int OPERR_UID_GET_EXCEED_LIMIT = 5; // 当前用户的所有设备超过限制，生成UID失败
    public static final int OPERR_DEVICE_UPDATE_CHANGE = 7; // 数据加密异常
    public static final int OPERR_DATA_DECODE_ERROR = 8; // 数据解密异常
    public static final int OPERR_SYS_ERROR = 9; // 系统异常
    public static final int OPERR_UID_GET_NOT_ROOT = 10; // 越狱不允许激活
    public static final int OPERR_UID_GET_NO_REGISTER = 11;// 超过用户允许激活限值1
    public static final int OPERR_IMEI_ERROR = 16;
    // 客户端请求协议结果状态
    public static final int OPERR_REGULAR_NET = 1; // 用户定期联网
    public static final int OPERR_INITIATIVE_NET = 2; // 用户主动联网
    public static final int OPERR_TEMP_NET = 3; // 用户临时联网，通过NextAction驱动

    // next_action行为信息中的Duty子元素内容
    public static final int REMOTE_CON_ORDER_DELETE = 1; // 表示远程控制的删除命令
    // 针对RemoteCon标识码
    public static final int REMOTE_CON_ORDER_LOCK = 2; // 表示远程控制的锁机命令
    // 针对RemoteCon标识码
    public static final int REMOTE_CON_ORDER_IGNORE = 3; // 表示远程控制的忽略命令
    // 针对RemoteCon标识码

    // next_action行为信息中的ExcuteType子元素内容
    public static final int EXCUTE_TYPE_IMMEDIATE = 1; // 立刻回答，接到反馈后，就立刻按反馈的要求，给服务器答复
    public static final int EXCUTE_TYPE_DELAY = 2; // 延迟回答，接到反馈后，先按反馈的要求，在客户端操作，操作完成后，再给服务器答复

    // 用户信息中UserLevel子元素内容值
    public static final int USER_LEVEL_COMMON = 1; // 普通用户
    public static final int USER_LEVEL_SPECIAL = 2; // 特级用户

    // ExcuteAction子元素内容值
    public static final int EXCUTE_ACTION_ALLOW = 1; // 允许 允许执行
    public static final int EXCUTE_ACTION_RECORD = 2; // 记录 记录在策略检查扫描结果里
    public static final int EXCUTE_ACTION_ALLOW_RECORD = 3; // 允许和记录
    public static final int EXCUTE_ACTION_PREVENT = 4; // 阻止 阻止执行
    public static final int EXCUTE_ACTION_PREVENT_RECORD = 6; // 阻止和记录
    public static final int EXCUTE_ACTION_ALARM = 8; // 报警 向服务平台即刻报警
    public static final int EXCUTE_ACTION_PREVENT_RECORD_ALARM = 14; // 阻止、记录和报警
    public static final int EXCUTE_ACTION_TIP = 16; // 提示 在客户端上提示
    public static final int EXCUTE_ACTION_ALLOW_TIP = 17; // 允许和提示
    public static final int EXCUTE_ACTION_ALLOW_RECORD_TIP = 19; // 允许、记录和提示
    public static final int EXCUTE_ACTION_ALL = 28; // 阻止、提示、记录和报警

    public static final int REQUEST_SUCCESS = 200; //
    public static final int EXCUTE_SUCCESS = 1; // 当次执行成功
    public static final int EXCUTE_FAIL = 2; // 当次执行失败
    public static final int UID_GET_NO_GUARD_PWD = 3; // 用户名和密码与设备已匹配，防盗密码缺失
    public static final int UID_GET_NO_MATCH_GUARD_PWD = 4; // 用户名和密码与设备已匹配，服务器存在防盗密码，和客户端不匹配
    public static final int UID_GET_FAIL = 5; // 用户名和密码与设备不匹配
    public static final int UID_GET_BEYOND = 6; // 当前用户名的所有设备已超过限制，生成UID失败
    // public static final int CHANGE_FLAG = 7; // 发生变更标识
    public static final int EXCUTE_DEVICE_CLEAR_CHOOSE = 91; // 设备已被选择性擦除
    public static final int EXCUTE_DEVICE_REMOVE = 92; // 设备已被淘汰
    public static final int EXCUTE_DEVICE_CLEAR = 93; // 设备已被重置
    public static final int CommandNotFound = 100;

    // 标识无操作
    public static final int DEFAULT_VALUE = -1;

    public static final int APP_PKG_RULE = 1;
    public static final int APP_CLASS_RULE = 2;

    public static final int DelayTime = 5000;
    //
    // XML 请求头格式
    public static final String XML_HEAD = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
    public static final String XML_BeginTag_Request = "<Request>";
    public static final String XML_EndTag_Request = "</Request>";
    // XML 标签头
    public static final String XML_Tag_Request = "Request";
    public static final String XML_Tag_Reply = "Reply";
    public static final String XML_Tag_Mobile_Info = "MobileInfo";
    public static final String XML_Tag_Model = "Model";
    public static final String XML_Tag_Maker = "Maker";
    public static final String XML_Tag_SN = "SN";
    public static final String XML_Tag_CpuInfo = "CpuInfo";
    // public static final String XML_Tag_RamInfo = "RamInfo";
    // public static final String XML_Tag_RomInfo = "RomInfo";
    public static final String XML_Tag_CameraInfo = "CameraInfo";
    public static final String XML_Tag_BluetoothInfo = "BluetoothInfo";
    public static final String XML_Tag_WifiMac = "WifiMac";
    // public static final String XML_Tag_SdInfo = "SdInfo";
    public static final String XML_Tag_Mcnc = "Mcnc";

    public static final String XML_Tag_Mobile_ID_Info = "MobileIDInfo";
    public static final String XML_Tag_Imei = "Imei";
    public static final String XML_Tag_Imsi = "Imsi";
    public static final String XML_Tag_SdID = "SdID";
    public static final String XML_Tag_IP = "ClientIP";
    public static final String XML_Tag_GuardPwd_Actived = "GuardPasswordActived";
    public static final String GuardPwd_Actived = "1";

    public static final String XML_Tag_ClientSoft_Info = "ClientSoftInfo";
    public static final String XML_Tag_Mobile = "Mobile";
    public static final String XML_Tag_MobileNum = "MobileNum";
    // public static final String XML_Tag_Cracked = "Cracked";
    public static final String XML_Tag_AllowUnkownSource = "AllowUnkownSource";
    public static final String XML_Tag_Lang = "Lang";
    public static final String XML_Tag_Country = "Country";
    public static final String XML_Tag_SmsCenter = "SmsCenter";
    public static final String XML_Tag_CellId = "CellID";
    public static final String XML_Tag_APN = "APN";

    // public static final String XML_Tag_Device_Monitor = "DeviceMonitor";
    public static final String XML_Tag_Category = "Category";
    // public static final String XML_Tag_Enabled = "Enabled";
    // public static final String XML_Tag_Disabled = "Disabled";
    // public static final String XML_Tag_TolKB = "TolKB";
    // public static final String XML_Tag_InKB = "InKB";
    // public static final String XML_Tag_OutKB = "OutKB";

    public static final String XML_Tag_Client = "Client";
    public static final String XML_Tag_SubCoopId = "SubCoopID";
    public static final String XML_Tag_ServerIp = "ServerIP";

    public static final String XML_Tag_SysPlat = "SysPlat";
    // public static final String XML_Tag_PlatformId = "PlatformID";
    public static final String XML_Tag_EditionId = "EditionID";
    public static final String XML_Tag_FirmwareVer = "FirmwareVer";
    public static final String XML_Tag_BasebandVer = "BasebandVer";
    public static final String XML_Tag_KernelVer = "KernelVer";
    public static final String XML_Tag_BuildNumber = "BuildNumber";
    // 用户信息
    public static final String XML_Tag_UserInfo = "ClientIDInfo";
    public static final String XML_Tag_UserName = "UserName";
    public static final String XML_Tag_UserPassword = "UserPassword";
    public static final String XML_Tag_MapViewType = "MapViewType";
    // public static final String XML_Tag_UserLevel = "UserLevel";
    // public static final String XML_Tag_GuardPassword = "GuardPassword";
    // public static final String XML_Tag_GuardPassword_Active = "Actived"; //
    // 若Actived为1，元素内容必填，否则可为空

    public static final String XML_Tag_OperID = "OperID";
    public static final String XML_Tag_UID = "ClientUID";
    public static final String XML_Tag_FlowNum = "FlowNum";
    public static final String XML_Tag_Timezone = "Timezone";
    public static final String XML_Tag_Result = "Result";
    // 设备更新信息
    public static final String XML_Tag_DeviceUpdate = "DeviceUpdate";
    public static final String XML_Tag_ServerIP = "ServerIP";
    // 设备定位信息
    public static final String XML_Tag_DeviceLocation = "DeviceLocation";
    public static final String XML_Tag_Longitude = "Longitude";
    public static final String XML_Tag_Latitude = "Latitude";

    public static final String XML_Tag_NextAction = "NextAction";
    public static final String XML_Tag_Next_FlowNum = "NextFlowNum";
    public static final String XML_Tag_ExcuteFlag = "ExcuteFlag";
    public static final String XML_Tag_ExcuteType = "ExcuteType";
    public static final String XML_Tag_Duty = "Duty";
    // 网络策略
    public static final String XML_Tag_NetStra = "NetStra";
    public static final String XML_Tag_DownVersion = "DownVersion";
    public static final String XML_Tag_FreNet = "FreNet";
    public static final String XML_Tag_Period = "Period";
    public static final String XML_Tag_ValidDay = "ValidDay";
    public static final String XML_Tag_Region = "Region";
    public static final String XML_Tag_NetStart = "OnNetBeg";
    public static final String XML_Tag_NetEnd = "OnNetEnd";
    public static final String XML_Tag_IntevalFre = "IntevalFre";
    public static final String XML_Tag_TimeOut = "TimeOut";
    // 应用策略
    public static final String XML_Tag_Appli_Stra = "AppliStra";
    public static final String XML_Tag_Item = "Item";
    public static final String XML_Tag_WhiteList = "WhiteList";
    public static final String XML_Tag_App = "App";
    public static final String XML_Tag_App_Type = "Type";
    public static final String XML_Tag_StraName = "StraName";
    public static final String XML_Tag_StraId = "StraID";
    public static final String XML_Tag_PkgName = "PkgName";
    // public static final String XML_Tag_Name = "Name";
    public static final String XML_Tag_Version_Code = "VersionCode";
    public static final String XML_Tag_Version_Name = "VersionName";
    public static final String XML_Tag_ExcuteAction = "ExcuteAction";
    public static final String XML_Tag_ExcuteDes = "ExcuteDescribe";
    public static final String XML_Tag_Level = "Level";
    public static final String XML_Tag_Class = "Class";
    public static final String XML_Tag_BlackList = "BlackList";
    // 备份与还原策略
    public static final String XML_Tag_BackOrRecoverStra = "BackOrRecoverStra";
    public static final String XML_Tag_Device_Data = "DeviceData";
    public static final int Contact_Index = 0;
    public static final int CallRecord_Index = 1;
    public static final int Message_Index = 2;
    public static final int DOWNLOAD_VERSION_TYPE = 4;// 下载列表
    public static final int DOWNLOAD_DATA_TYPE = 5;// 下载列表
    // 还原版本信息
    public static final String XML_Tag_Recover_Version = "RecoverVersion";
    public static final String XML_Tag_ID = "ID";
    public static final String XML_Tag_Version = "Version";
    public static final String XML_Tag_Code = "Code";
    public static final String XML_Tag_Total_Num = "TolNumber";
    public static final String XML_Tag_Time = "Time";
    public static final String XML_Tag_Type = "Type";
    public static final String XML_Tag_Type_Contact = "Contact";
    public static final String XML_Tag_Type_Message = "Message";
    public static final String XML_Tag_Type_CallRecord = "CallRecord";

    // 还原与备份数据信息
    public static final String XML_Tag_BackOrRecoverData = "BackOrRecoverData";
    public static final String XML_Tag_FileName = "FileName";
    public static final String XML_Tag_FileIndex = "FileIndex";
    // 远程控制信息
    public static final String XML_Tag_Remote_Control = "RemoteControl";
    public static final String XML_Tag_OperType = "OperoType";
    // 云查杀请求报文应用程序信息标签
    public static final String XML_Tag_DeviceId = "DeviceID";
    public static final String XML_Tag_ServiceInfo = "ServiceInfo";
    public static final String XML_Tag_Business = "business";
    public static final String XML_Tag_Upload = "Upload";
    public static final String XML_Tag_Background = "background";

    public static final String XML_Tag_Pkgs = "Pkgs";
    public static final String XML_Tag_Apk = "Apk";
    public static final String XML_Tag_InstallPath = "nstallPath";
    public static final String XML_Tag_InstallTime = "installTime";
    public static final String XML_Tag_CScan_Name = "name";
    public static final String XML_Tag_CScan_Version_Code = "VersionCode";
    public static final String XML_Tag_CScan_Version_Name = "VersionName";
    public static final String XML_Tag_System_App = "systemApp";
    public static final String XML_Tag_Is_AM_Download = "isAmDownload";
    public static final String XML_Tag_Is_AutoRun = "isAutoRun";
    public static final String XML_Tag_LocalScan_VirusName = "localScanVirusName";
    public static final String XML_Tag_Is_Allowable = "isAllowable";
    public static final String XML_Tag_SystemSize = "systemSize";
    public static final String XML_Tag_File = "File";
    public static final String XML_Tag_File_Name = "name";
    public static final String XML_Tag_File_Ref = "ref";
    public static final String XML_Tag_Uses_PerList = "UsesPermissionList";
    public static final String XML_Tag_Android = "android";
    // 云查杀返回报文标签信息
    public static final String XML_Tag_pkgs = "Pkgs";
    public static final String XML_Tag_Report = "Report";
    public static final String XML_Tag_ScanId = "ScanId";
    public static final String XML_Tag__Clound_Scan_ID = "id";
    public static final String XML_Tag_Cost = "cost";
    public static final String XML_Tag_Text = "text";
    public static final String XML_Tag_SClasses = "SClasses";
    public static final String XML_Tag_SClass = "SClass";
    public static final String XML_Tag_RClasses = "RClasses";
    public static final String XML_Tag_RClass = "RClass";
    public static final String XML_Tag_DetectClasses = "DetectClasses";
    public static final String XML_Tag_DClass = "DClass";

    public static final String XML_Tag_VirvusName = "virusName";
    public static final String XML_Tag_Wanted = "wanted";
    public static final String XML_Tag_SystemApp = "systemApp";
    public static final String XML_Tag_Scan_PkgName = "pkgName";
    public static final String XML_Tag_rClass = "rclass";
    public static final String XML_Tag_dClass = "dclass";
    public static final String XML_Tag_ServerId = "serverId";
    public static final String XML_Tag_Security = "security";
    public static final String XML_Tag_Rating = "Rating";
    public static final String XML_Tag_Score = "score";
    public static final String XML_Tag_cntUniq = "cntUniq";
    public static final String XML_Tag_Reviews = "Reviews";
    public static final String XML_Tag_Cnt = "cnt";
    public static final String XML_Tag_Note = "Note";
    public static final String XML_Tag_Reason = "Reason";
    public static final String XML_Tag_Advice = "Advice";
    // 周期操作信息
    public static final String XML_Tag_CircleOpero = "CircleOpero";
    public static final String XML_Tag_OnNetStraCircle = "OnNetStraCircle";
    public static final String XML_Tag_BackupContactCircle = "BackuContactsCircle";
    public static final String XML_Tag_BackupCallRecordCircle = "BackupCallRecordCircle";
    public static final String XML_Tag_BackupMessageCircle = "BackupShortMessageCircle";
    public static final String XML_Tag_ScanStra = "ScanStra";
    public static final String XML_Tag_Circle_Name = "Name";
    public static final String XML_Tag_Circle_DownVersion = "DownVersion";
    public static final String XML_Tag_Circle_Actived = "Actived";
    public static final String XML_Tag_Circle_Period = "Period";
    public static final String XML_Tag_Circle_ValidDay = "ValidDay";
    public static final String XML_Tag_Circle_OnNetBeg = "OnNetBeg";
    public static final String XML_Tag_Circle_IntevalFre = "IntevalFre";

    // 定期联网信息
    public static final String XML_Tag_NetRequest = "NetRequest";
    public static final String XML_Tag_CurrentVersion = "CurrentVersion";
    public static final String XML_Tag_BackupStra = "BackupStra";

    // 应用策略报警信息
    public static final String XML_Tag_AppliWarn = "AppliWarn";
    public static final String XML_Tag_AppliWarn_Item_ID = "ID";
    public static final String XML_Tag_AppliWarn_StraName = "StraName";
    public static final String XML_Tag_FiveItem = "FiveItem";
    public static final String XML_Tag_VersionCode = "VersionCode";
    public static final String XML_Tag_VersionName = "VersionName";
    public static final String XML_Tag_PublicKey = "PublicKey";
    public static final String XML_Tag_BehaviorTime = "BehaviorTime";
    public static final String XML_Tag_Index = "Index";
    public static final String XML_Tag_StraResult = "StraResult";

    // v2.0
    // 身份验证
    public static final String XML_Tag_Name = "Name";
    public static final String XML_Tag_Jailed = "Jailed";
    public static final String XML_Tag_ModelType = "ModelType";
    public static final String XML_Tag_ClientOSType = "ClientOSType";
    // 设备初始化
    public static final String XML_Tag_RamAvailable = "RamAvailable";
    public static final String XML_Tag_RamTotal = "RamTotal";
    public static final String XML_Tag_RomAvailable = "RomAvailable";
    public static final String XML_Tag_RomTotal = "RomTotal";
    public static final String XML_Tag_SdAvailable = "SdAvailable";
    public static final String XML_Tag_SdTotal = "SdTotal";
    public static final String XML_Tag_Ecid = "Ecid";
    public static final String XML_Tag_Battery = "Battery";
    public static final String XML_Tag_BatteryLevel = "BatteryLevel";
    public static final String XML_Tag_BatteryState = "BatteryState";
    public static final String XML_Tag_BtMac = "BtMac";
    public static final String XML_Tag_BootUp = "BootUp";
    public static final String XML_Tag_Roaming = "Roaming";
    // 设备更新
    public static final String XML_Tag_NetTraffic = "NetTraffic";
    public static final String XML_Tag_Date = "Date";
    public static final String XML_Tag_WifiTolKB = "WifiTolKB";
    public static final String XML_Tag_CeluarTolKB = "CeluarTolKB";
    public static final String XML_Tag_SignalStrength = "SignalStrength";
    public static final String XML_Tag_SimChanged = "SimChanged";
    public static final String XML_Tag_EncryptionStatus = "EncryptionStatus";
    // 上传设备管理状态
    public static final String XML_Tag_DeviceAdmin = "DeviceAdmin";
    // 上传hpns token
    public static final String XML_Tag_APNS = "APNS";
    public static final String XML_Tag_TOKEN = "Token";

    // push
    public static final String XML_Tag_Push = "Push";
    public static final String XML_Tag_cmd = "cmd";

    // 得到应用列表
    public static final String XML_Tag_AppInfo = "AppInfo";
    public static final String XML_Tag_ClientOS = "ClientOS";
    public static final String XML_Tag_OSVersion = "OSVersion";
    // public static final String XML_Tag_Class = "Class";
    public static final String XML_Tag_CateId = "CateId";
    public static final String XML_Tag_SearchWord = "SearchWord";
    public static final String XML_Tag_StartIdx = "StartIdx";
    public static final String XML_Tag_RowNum = "RowNum";

    public static final String XML_Tag_AppList = "AppList";
    public static final String XML_Tag_TotalCount = "TotalCount";
    // public static final String XML_Tag_App = "App";
    public static final String XML_Tag_AppId = "AppId";
    public static final String XML_Tag_Title = "Title";
    public static final String XML_Tag_Icon = "Icon";
    public static final String XML_Tag_PackageName = "PackageName";
    // public static final String XML_Tag_Category = "Category";
    // public static final String XML_Tag_Rating = "Rating";
    public static final String XML_Tag_CreateDate = "CreateDate";
    public static final String XML_Tag_UpdateDate = "UpdateDate";
    public static final String XML_Tag_Status = "Status";
    public static final String XML_Tag_FromLogout = "FromLogout";
    public static final String XML_Tag_WifiDownload = "WifiDownload";

    // 获取应用详情
    public static final String XML_Tag_Developer = "Developer";
    // public static final String XML_Tag_Version = "Version";
    public static final String XML_Tag_Size = "Size";
    public static final String XML_Tag_RequiredOS = "RequiredOS";
    public static final String XML_Tag_Description = "Description";
    public static final String XML_Tag_NewFeature = "NewFeature";
    public static final String XML_Tag_ScreenShots = "ScreenShots";
    public static final String XML_Tag_Image = "Image";

    // 获取应用分类
    public static final String XML_Tag_Categories = "Categories";
    public static final String XML_Tag_id = "id";
    public static final String XML_Tag_name = "name";

    // 获取我的应用列表
    public static final String XML_Tag_Filter = "Filter";

    // 全部更新
    public static final String XML_Tag_URL = "URL";

    // 设备配置
    public static final String XML_Tag_DeviceConfig = "DeviceConfig";
    public static final String XML_Tag_Password = "Password";
    public static final String XML_Tag_Simple = "Simple";
    public static final String XML_Tag_LetterNum = "LetterNum";
    public static final String XML_Tag_MinLen = "MinLen";
    public static final String XML_Tag_NonLetterNum = "NonLetterNum";
    public static final String XML_Tag_Valid = "Valid";
    public static final String XML_Tag_AutoLock = "AutoLock";
    public static final String XML_Tag_History = "History";
    public static final String XML_Tag_LockScope = "LockScope";
    public static final String XML_Tag_Failed = "Failed";
    public static final String XML_Tag_WifiList = "WifiList";
    public static final String XML_Tag_Wifi = "Wifi";
    public static final String XML_Tag_SSID = "SSID";
    public static final String XML_Tag_Auto = "Auto";
    public static final String XML_Tag_Hide = "Hide";
    public static final String XML_Tag_Pass = "Pass";
    public static final String XML_Tag_Proxy = "Proxy";
    public static final String XML_Tag_VPNList = "VPNList";
    public static final String XML_Tag_VPN = "VPN";
    public static final String XML_Tag_Server = "Server";
    public static final String XML_Tag_Acount = "Acount";
    public static final String XML_Tag_Auth = "Auth";
    public static final String XML_Tag_Key = "Key";
    public static final String XML_Tag_Send = "Send";
    public static final String XML_Tag_Custom = "Custom";
    public static final String XML_Tag_Value = "Value";
    public static final String XML_Tag_User = "User";
    public static final String XML_Tag_Addr = "Addr";
    public static final String XML_Tag_APNList = "APNList";
    public static final String XML_Tag_Port = "Port";

    // anjx 1217 add pushInfo
    public static final String XML_TAG_PUSH_INFO = "PushInfo";
    public static final String XML_TAG_PUSH_TYPE = "PushType";
    public static final String XML_TAG_PUSH_LIST = "PushList";
    // anjx add end

    // 上传策略列表
    public static final String XML_TAG_Profilelist = "Profilelist";
    public static final String XML_TAG_Profile = "Profile";
    public static final String XML_TAG_uuid = "uuid";

    //
    public static final String XML_Tag_ClientUpgrade = "ClientUpgrade";
    public static final String XML_Tag_LatestVersionCode = "LatestVersionCode";
    public static final String XML_Tag_UpdateURL = "UpdateURL";
    public static final String XML_Tag_StoreURL = "StoreURL";
    public static final String XML_Tag_UpdateTipMsg = "UpdateTipMsg";

    // 上传违规信息
    public static final String XML_Tag_Violation = "Violation";
    public static final String XML_Tag_VioliationId = "VioliationId";
    public static final String XML_Tag_ConditionType = "ConditionType";
    public static final String XML_Tag_ConditionId = "ConditionId";
    public static final String XML_Tag_ConditionValue = "ConditionValue";
    public static final String XML_Tag_ProcessStrategyId = "ProcessStrategyId";
    public static final String XML_Tag_ViolationValue = "ViolationValue";
    public static final String XML_Tag_ProcessActionId = "ProcessActionId";
    public static final String XML_Tag_ProcessDelayTime = "ProcessDelayTime";
    public static final String XML_Tag_ViolationProcess = "ViolationProcess";

    // 上传详细流量信息
    public static final String XML_Tag_NetTrafficList = "NetTrafficList";

    // 获得消息列表 request
    public static final String XML_Tag_Message = "Message";
    public static final String XML_Tag_MessageInfo = "MessageInfo";
    public static final String XML_Tag_MessageStatus = "MessageStatus";
    public static final String XML_Tag_MaxId = "MaxId";
    public static final String XML_Tag_MinId = "MinId";
    public static final String XML_Tag_MessageList = "MessageList";
    public static final String XML_Tag_MessageId = "MessageId";
    public static final String XML_Tag_From = "From";
    public static final String XML_Tag_Body = "Body";
    public static final String XML_Tag_ResourceURI = "ResourceURI";
    public static final String XML_Tag_Uuid = "Uuid";
    // 统计局新需求 zhangyan
    public static final String XML_Tag_MessgeType = "MessageType";
    // end

    public static final String Model = Build.MODEL;
    public static final String MANUFACTURER = Build.MANUFACTURER;
    public static final String FIRMWARE_VER = Build.VERSION.RELEASE;
    public static final String BUILDNUMBER = Build.DISPLAY;
    public static final String SoftLanguage = "31";
    public static final String Language = Common.getPlatformLanguage();
    public static final String Country = "86";
    public static final String TIMEZONE = Common.getTimeZone();

    public static int httpConnectionConnectTimeout = 30000;
    public static final int httpConnectionReadTimeout = 90000;
    public static final int NET_BUFFER_SIZE = 512;
    public static final int NET_MAX_SIZE = 1024 * 1024 * 10;
    // public static final int NET_MAX_SIZE = 1024 * 10;

    public static final int RESPONSE_MESSAGE = 111;
    // 发送报文头结点长度
    public static final int PACKET_HEAD_LEN = 16;
    // 发送报文头，每一个字段长度
    public static final int PACKET_HEAD_COMMOND_LEN = 4;
    // 异或加密的值
    public static final int XOR_VAULE = 0x6e;
    // 压缩，解压格式
    public static final String UTF_8 = "UTF-8";
    // 协议版本
    public static final int PROTOCOL_VERSION = 1001;
    // 压缩方式
    public static final int UN_COMPRESS = 0;
    public static final int COMPRESS_ZIP = 1;
    // 加密方式
    public static final int UNENCRYPT = 0;
    public static final int ENCRYPT_XOR = 1;
    public static final int ENCRYPT_SSL = 2;
    // 功能加密
    public static final int FUNCTION_TYPE = 0;

    // shared preference default
    public static final String DEFAULT_SPSV = "null";
    public static final int DEFAULT_SPIV = -1;

    // shareperference key
    public static final String IMSI_KEY = "imsi";
    public static final String SD_ID_KEY = "sd_id";
    public static final String CLIENT_IP_KEY = "client_ip";
    public static final String ROOT_KEY = "root";
    public static final String ONENT_TAG = "onnet";
    public static final String SCAN_TAG = "scan";
    public static final String BACKUP_SMS_TAG = "backup_sms";
    public static final String BACKUP_CONTACT_TAG = "backup_contact";
    public static final String BACKUP_CALL_TAG = "backup_call";
    public static final String SETPWD_TAG = "setpwd";// 设置密码
    public static final String LOCATE_TAG = "locate";// 定位
    public static final String MANAGE_LOG_TAG = "manage_log";// 日志文件管理
    public static final String BACKUP_CHECK_KEY = "backup_check";
    public static final String STRA_VERSION_KEY = "_stra_version"; // 连网策略版本
    public static final String STRA_PERIOD_KEY = "_stra_period";
    public static final String STRA_VALID_DAY_KEY = "_stra_valid_day";
    public static final String STRA_BEG_KEY = "_stra_beg";
    public static final String STRA_INTEVAL_FRE_KEY = "_stra_inteval_fre";
    public static final String STRA_STATUS_KEY = "_stra_status";
    public static final String STRA_VERSION_USED_KEY = "_stra_version_used";
    public static final String APPLI_STRA_VERSION_KEY = "appli_stra_version"; // 应用策略版本
    public static final String APPLI_STRA_VERSION_USED_KEY = "appli_stra_version_used";
    public static final String USER_ID_KEY = "user_id"; // 用户ID
    public static final String SERVER_IP_KEY = "server_ip"; // 用户ID
    public static final String REGISTER_DIVICE_COMPLETE_KEY = "register_divice_complete"; // 注册成功
    public static final String SDCARD_PATH_KEY = "sdcard_path";
    public static final String IS_FIRST_INSTALL_KEY = "is_first_install_shortcut";
    public static final String RESTART_FLAG_KEY = "restart_flag";

    public static final String SCAN_LAST_TIME = "scan_last_time";// 最后一次扫描时间
    public static final String SCAN_LAST_FILE_COUNT = "scan_last_file_count"; // 最后一次扫描文件数
    public static final String SCAN_LAST_UNKNOWN_COUNT = "scan_last_unknown_count"; // 最后一次未知文件个数
    public static final String SCAN_LAST_HARM_COUNT = "scan_last_harm_count";// 最后一次扫描病毒个数
    public static final String SCAN_LAST_WANTED_COUNT = "scan_last_wanted_count"; // 最后一次未知文件个数
    public static final String SCAN_LAST_CAUTION_COUNT = "scan_last_caution_count"; // 最后一次未知文件个数
    public static final String SCAN_LAST_CLEAR_COUNT = "scan_last_clear_count";// 最后一次扫描清除个数

    public static final String BACKUP_LAST_TIME_KEY = "backup_last_time";// 最后一次备份时间
    public static final String BACKUP_CONTACT_UNM_KEY = "backup_contact_num";// 最后一次备份联系人个数
    public static final String BACKUP_SMS_NUM_KEY = "backup_sms_num";// 最后一次备份联系人个数
    public static final String BACKUP_CALL_NUM_KEY = "backup_call_num";// 最后一次备份联系人个数
    public static final String BACKUP_CHECK_STATUS_KEY = "backup_check_status"; // 上次备份选择值

    // public static final String CONTROL_GUARD_PASSWORD_KEY =
    // "control_guard_password"; // 防盗密码
    public static final String CONTROL_ORDER_SUODING_KEY = "control_oreder_suoding"; // 是否指令锁定
    public static final String CONTROL_CHANGE_SUODING_KEY = "control_change_suoding"; // 是否改变锁定
    public static final String UNINSTALL_PROTECT_OPEN_KEY = "uninstall_protect_open";// 开启卸载保护
    public static final String STRA_APPLI_OPEN_KEY = "stra_appli_open";// 开启应用策略
    public static final String STRA_BACKUP_OPEN_KEY = "stra_backup_open";// 开启备份策略
    public static final String STRA_SCAN_OPEN_KEY = "stra_scan_open";// 开启扫描策略
    public static final String LOCATE_OPEN_KEY = "default_locate_open";// 开启android定位

    // ContentValues key
    public static final String USER_NAME_KEY = "user_name_key"; // 用户名
    public static final String USER_PASSWORD_KEY = "user_password_key"; // 用户密码
    // public static final String USER_LEVEL_KEY = "user_level_key"; // 用户等级 0
    // 是普通,1 vip
    // public static final String USER_GUARD_PASSWORD_KEY =
    // "user_guard_password_key"; // 防盗密码
    // public static final int USER_GUARD_PASSWORD_NOT_NULL = 1; // 防盗密码标识
    public static final String USER_DEVICE_NAME_KEY = "user_device_name_key";
    public static final String CIRCLE_OPERO_KEY = "circle_opero_key"; // 周期策略
    public static final String APPLI_STRA_KEY = "appli_stra_key"; // 应用策略
    public static final String BACKUP_STRA_KEY = "backup_stra_key"; // 备份策略
    public static final String FLOW_NUM_KEY = "flow_num_key"; // 流水号
    public static final String EXCUTE_FLAG = "excute_flag_key"; // 下一步
    public static final String LOCATION_LONG_KEY = "longitude_key"; // 经度
    public static final String LOCATION_LATI_KEY = "latitude_key"; // 纬度
    public static final String CONFIG_UPDATE_TIME_KEY = "config_update_time_key";
    public static final String CONTACT_SYNC_OPEN = "contatc_sync_open_key";
    public static final String USER_DEVICE_STATUS_KEY = "user_device_status_key"; // 设备连接状态
    public static final String PUSH_TYPE_KEY = "push_type_key";
    // anjx 1217 add push
    public static final String PUSH_APP_ID_KEY = "push_app_id";
    public static final String PUSH_USER_NAME_KEY = "push_user_name";
    public static final String PUSH_USER_PASSWORD_KEY = "push_user_password";
    public static final int PUSH_CMD_POLICY_REPLY = 209;
    // anjx add end
    public static final String HPNS_TOKEN_KEY = "hpns_token_key";
    public static final String HPNS_UPLOADED_TOKEN_KEY = "hpns_uploaded_token_key";
    public static final String HPNS_STATUS_KEY = "hpns_status_key";

    // 卸载sd卡监控
    public static final String DISABLE_SDCARD_KEY = "disable_sdcard_key";

    public static final String DEFAULT_SD_PATH = Environment.getExternalStorageDirectory().toString();
    public static final String DEFAULT_PATH = DEFAULT_SD_PATH + "/NQ/";
    public static final String BACKUP_PATH = DEFAULT_PATH + "backup/";
    public static final String RECOVER_PATH = DEFAULT_PATH + "restore/";
    public static final String BACKUP_LOCAL_PATH = DEFAULT_PATH + "local_backup/";
    public static final String LOG_SUFFIX = ".log";
    public static final String LOG_DEBUG_FILE = DEFAULT_PATH + "debug/";
    public static final String LOG_ERROR_FILE = DEFAULT_PATH + "error/";
    public static final String LOG_CRASH_PATH = DEFAULT_PATH + "crash/";
    public static final String LOG_REGISTER_FILE = DEFAULT_PATH + "register.log";
    public static final String LOG_PUSH_FILE = DEFAULT_PATH + "push/";

    public static final String UPGRAD_FILE = "update.apk";

    public static final String BACKUP_HISTORY_FILE = "history.bak";
    public static final String BACKUP_CONTACT_FILE = "contactsbakd.bak";
    public static final String BACKUP_CALl_FILE = "callbakd.bak";
    public static final String BACKUP_SMS_FILE = "smsbakd.bak";
    public static final String BACKUP_LOCAL_CONTACT_FILE = "contactslocal.bak";
    public static final String BACKUP_LOCAL_SMS_FILE = "smslocal.bak";
    public static final String BACKUP_SUFFIX_TEMP = ".tmp";
    public static final String BACKUP_SUFFIX_COPY = ".copy";
    // public static final String T_MOSECURITY_ROOT_DIR = DEFAULT_PATH
    // + "/ks_program/mosecurity";

    public static final String SPEED_TEST_DOWNLOAD_FILE = DEFAULT_PATH + "speedtest.bak";

    // 数据库名
    public static final String DB_NAME_APP = "nq_pineapple_app.db";

    // Action
    public static final String PACKAGE_ADDED_ACTION = "android.intent.action.PACKAGE_ADDED";
    public static final String PACKAGE_REMOVED_ACTION = "android.intent.action.PACKAGE_REMOVED";

    // ApliStraType
    public static final int APPLI_STRA_BLACK_TYPE_PAK = 1;
    public static final int APPLI_STRA_BLACK_TYPE_TYPE = 2;
    public static final int APPLI_STRA_WHITE_TYPE_PAK = 3;
    public static final int APPLI_STRA_WHITE_TYPE_TYPE = 4;

    // handler
    // public static final int MSG_CLOSE_PROGRESS_DIALOG = 1;
    public static final int MSG_CLOSE_ACTIVITY = 0;

    // 安全等级
    public static final int SCAN_STATUS_HARM = 10;
    public static final int SCAN_STATUS_WANTED = 20;
    public static final int SCAN_STATUS_CAUTION = 30;
    public static final int SCAN_STATUS_UNKNOWN = 40;
    public static final int SCAN_STATUS_SECURE = 50;

    // backup
    public static final String VMAP_ITEM_IMAGE = "VMAP_ITEM_IMAGE";
    public static final String VMAP_ITEM_TITLE = "VMAP_ITEM_TITLE";
    public static final String VMAP_ITEM_DESC = "VMAP_ITEM_DESC";
    public static final String VMAP_ITEM_CLASS = "VMAP_ITEM_CLASS";

    // 备份联系人中用到的常量
    public static final String BACKUP_SEPARATOR = ";";
    public static final String BACKUP_SEPARATOR_ADR = ":";
    public static final String PROPERTY_ID = "ID";
    public static final String PROPERTY_N = "N";
    public static final String PROPERTY_FN = "FN";
    public static final String PROPERTY_ADR = "ADR";
    public static final String PROPERTY_ADR_DETAIL = "ADETAIL";
    public static final String PROPERTY_ADR_TYPE = "ATYPE";
    public static final String PROPERTY_EMAIL = "EMAIL";
    public static final String PROPERTY_EMAIL_TYPE = "ETYPE";
    public static final String PROPERTY_TEL = "TEL";
    public static final String PROPERTY_TEL_TYPE = "TTYPE";
    public static final String PROPERTY_ORG = "ORG";
    public static final String PROPERTY_ORG_TITLE = "OTITLE";
    public static final String PROPERTY_ORG_TYPE = "OTYPE";
    public static final String RESTORE_DATA_TYPE = "restore_date_type";

    public static final String T_CONTACT_DIR = "contact";
    public static final String T_SMS_DIR = "sms";
    public static final int OPERATION_CANCELLED = 123;
    /**
     * default value of the item status
     */
    public static final int DEFAULT_ITEM_STATUS = -11;
    /**
     * header for the compatiblity of the old version
     */
    public static final byte[] COMPRESS_HEADER = "nq_pineapple_backup_compress".getBytes();
    /**
     * byte version of json header
     */
    public static final byte[] JSON_HEADER = "[".getBytes();

    /**
     * finish the contact backup to the local file
     */
    public static final int CONTACT_BAKCUP_DOWN = 0;
    /**
     * finish backup the messages to local file
     */
    public static final int SMS_BACKUP_DOWN = 1;
    /**
     * setttings backup finished
     */
    public static final int CALL_BAKCUP_DOWN = 2;
    /**
     * set the session id back after relogin
     */
    // public static final int SET_SID_BACK = 7;
    /**
     * there is no backup files in the server
     */
    public static final int NO_BACKUP = 8;
    /**
     * network error
     */
    public static final int NETWORK_ERROR = 29;
    /**
     * download backup files done
     */
    public static final int DOWNLOAD_DONE = 10;
    /**
     * download the backup files fail
     */
    public static final int DOWNLOAD_FAIL = 11;
    /**
     * restore finished
     */
    public static final int RESTORE_FINISH = 12;
    /**
     * finish the upload the backup files
     */
    public static final int UPLOAD_DONE = 14;
    /**
     * failed when restore the data
     */
    public static final int DATA_RESTORE_FAIL = 18;
    /**
     * download backup files done
     */
    public static final int DOWNLOAD_VERSION_DONE = 19;

    public static final int SERVICE_CONNECT_ERROR = 20;
    /**
     * cancel return value
     */
    public static final int CANCEL_RETURN = -1;
    /**
     * upload fail
     */
    public static final int UPLOAD_FAIL = -15;
    /**
     * user id is null
     */
    public static final int NULL_USERID = 10001;
    /**
     * response root is null or network exception (IOException,
     * HttpRequest.BadRequestException)
     */
    public static final int NR_NET_EXCEP = 10002;
    /**
     * file folder is null
     */
    public static final int FILE_FOLDER_NULL = 10003;
    /**
     * folder is empty or can't get the file list
     */
    public static final int EMPTY_FOLDER = 10005;
    /**
     * file was not exist when restore after the download
     */
    public static final int FILE_NOT_EXIST_WR = -10009;
    /**
     * get list fail from the local file or the there was no content in the file
     */
    public static final int LIST_NULL_WR = -10010;
    /**
     * restore 0 item
     */
    public static final int RESTORE_EMPTY = -10011;
    /**
     * decrypt fail or can't find the file be decrypt
     */
    public static final int DECRYPT_FAIL = -10012;
    /**
     * sms or contacts open database exception
     */
    public static final int DB_OPEN_EXCEPTION = -10013;
    /**
     * load the contacts and generate JSONArray fail
     */
    public static final int CONTACT_LOADJA_FAIL = -10014;
    /**
     * create File and write the JSONArray to the file fail
     */
    public static final int WRITE_JA_FILE_FAIL = -10015;
    /**
     * encrypt fail
     */
    public static final int ENCRYPT_FAIL = -10016;
    /**
     * messages backup to local file fail
     */
    public static final int SMS_BACKUP_FAIL = -10017;
    /**
     * copy failed
     */
    public static final int COPY_FAIL = -10024;
    /**
     * local file didn't exists
     */
    public static final int LOCAL_FILE_NO_EXIST = -10025;

    // guard
    public static final int MSG_DINWEI_LOCATE_CLOSE_TUBA = 1;
    public static final int MSG_DINWEI_LOCATE_CLOSE_ANDROID = 2;
    public static final int MSG_DINWEI_DIALOG_SHOW = 3;

    // Timer
    public static final String BROADCAST_TIMER = "_timer_broadcast";
    public static final int TIMMER_ONNET_REQUEST = 0x0;
    public static final int TIMMER_SCAN_REQUEST = 0x1;
    public static final int TIMMER_BACKUP_CONTACT_REQUEST = 0x2;
    public static final int TIMMER_BACKUP_SMS_REQUEST = 0x3;
    public static final int TIMMER_BACKUP_CALL_REQUEST = 0x4;
    public static final int TIMMER_SETPWD_REQUEST = 0x5;
    public static final int TIMMER_LOCATE_REQUEST = 0x6;
    public static final int TIMMER_MANAGE_LOG_REQUEST = 0x7;

    // settting
    public static final String patternsPwdStr = "[A-Za-z0-9]{6,12}";

    public static final String DEVICE_CATEGORY_POWER = "Power";
    public static final String DEVICE_CATEGORY_USB = "USB";
    public static final String DEVICE_CATEGORY_BT = "BT";
    public static final String DEVICE_CATEGORY_GOOGLE = "Google";
    public static final String DEVICE_CATEGORY_CLIENT = "EmailClient2";

    // pwd
    public static final String PWD_PREFIX = "NQ_";
    public static final String PWD_SUFFIX = "^Sky";

    public static final int GET_DEVICE_INFO_SUCESS = 1;
    public static final int GET_DEVICE_INFO_ERROR = 0;
    public static final int GET_CLIENT_UPGRAD = 2;

    public static String EXTRA_TITLE = "extra_title";
    public static String EXTRA_URL = "extra_url";

    // push
    public static final int PUSH_OPERO_WAKE = -1;
    public static final int PUSH_OPERO_ALERT = 0;// 发送提示信息
    public static final int PUSH_OPERO_FIND = 1;// 设备查找（播放铃声）
    public static final int PUSH_OPERO_LOCATE = 2;// 设备定位cmd=2
    public static final int PUSH_OPERO_NOTIFY_APP_UPDATE = 3;// 应用更新通知
    public static final int PUSH_OPERO_NOTIFY_APP_ADD = 4;// 应用新增通知cmd=4
    public static final int PUSH_OPERO_NOTIFY_FILE_UPDATE = 5;// 文档更新通知cmd=5
    public static final int PUSH_OPERO_NOTIFY_FILE_ADD = 6;// 文档新增通知cmd=6
    public static final int PUSH_OPERO_DEVICE_INFO = 7;// 设备信息查询（流量/电池/越狱/存储器容量）
    public static final int PUSH_OPERO_UPLOAD_APP_LIST = 8;// 应用列表上传cmd=8
    public static final int PUSH_OPERO_DEVICE_LOCK = 11;// 锁定设备cmd=11
    public static final int PUSH_OPERO_CLEAR_PWD = 12;// 清除密码cmd=12
    public static final int PUSH_OPERO_DEVICE_CLEAR = 13;// 设备擦除cmd=13
    public static final int PUSH_OPERO_DEVICE_CLEAR_CHOOSE = 14;// 选择性擦除cmd=14
    public static final int PUSH_OPERO_DEVICE_REMOVE = 15;// 淘汰设备cmd=15
    public static final int PUSH_OPERO_APP_UPDATE = 16;// 安装/更新应用cmd=16
    public static final int PUSH_OPERO_APP_UNINSTALL = 17;// 卸载应用cmd=17
    public static final int PUSH_OPERO_PLOY_PWD = 18;// 下发密码策略cmd=18
    public static final int PUSH_OPERO_PLOY_CAMERA = 19;// 下发限制策略cmd=19
    public static final int PUSH_OPERO_PLOY_ENCRY = 20;// 下发加密策略cmd=20
    public static final int PUSH_OPERO_PLOY_WIFI = 21;// 下发WiFi配置cmd=21
    public static final int PUSH_OPERO_PLOY_VPN = 22;// 下发VPN配置cmd=22
    public static final int PUSH_OPERO_PLOY_APN = 23;// 下发APN配置cmd=23
    public static final int PUSH_OPERO_PLOY_DEL = 24;// 删除下发的策略
    public static final int PUSH_OPERO_POLICY_LIST = 25;// 上传策略列表
    public static final int PUSH_OPERO_INSTALL_CER = 26;// 下载证书
    public static final int PUSH_OPERO_POLICY_MEM_ = 27;// 下发MEM配置
    public static final int PUSH_OPERO_APP_ENABLE = 28;// MDM自有应用配置暂停/使用
    public static final int PUSH_OPERO_PLOY_BORW = 29;// 黑白名单
    public static final int PUSH_OPER_VIOLATION = 30;// 违规策略下发
    public static final int PUSH_OPER_WEB_BLACK_WHITE = 31;// 浏览器黑白名单
    public static final int PUSH_OPER_TOUCH_DOWN = 32;// 平安touch down
    public static final int PUSH_OPER_LOC_CONFIG = 33;

    public static final int PUSH_OPER_DEL_FOLDER = 401;// 删除文件目录。民生定制。

    public static final String PUSH_APPS = "aps";
    public static final String PUSH_CMD = "cmd";
    public static final String PUSH_FLOWNUM = "flownum";
    public static final String PUSH_ALERT = "alert";
    public static final String PUSH_SOUND = "sound";
    public static final String PUSH_BADGE = "badge";
    public static final String PUSH_PWD = "pwd";
    public static final String PUSH_APP_LIST_ID = "applistid";
    public static final String PUSH_APP_LIST_TYPE = "applisttype";
    public static final String PUSH_URL_LIST_ID = "urllistid";
    public static final String PUSH_URL_LIST_TYPE = "urllisttype";
    public static final String PUSH_URL_LIST = "urllist";
    public static final String PUSH_ALARMFREQUENCY = "alarmFrequency";

    public static final String PUSH_APP_LIST = "applist";
    public static final String PUSH_APP_ID = "appId";
    public static final String PUSH_APP_NAME = "appName";
    public static final String PUSH_ID = "id";
    public static final String PUSH_TYPES = "types";
    public static final String PUSH_URL = "url";
    public static final String PUSH_PKG_NAME = "pkgName";
    public static final String PUSH_VERSION = "ver";
    public static final String PUSH_TITLE = "title";
    public static final String PUSH_WIFI_DOWNLOAD = "wifiDownload";
    public static final String PUSH_ENABLE = "enable";
    public static final String PUSH_MUST = "must";

    public static final String PUSH_PASSWORD = "password";
    public static final String PUSH_PW_COMPLEXITY = "pwComplexity";
    public static final String PUSH_MIN_LENGTH = "pwLength";
    public static final String PUSH_MIN_LETTERS = "minChars";
    public static final String PUSH_MIN_LOWERCASE = "minLowerChars";
    public static final String PUSH_MIN_UPPERCASE = "minUpperChars";
    public static final String PUSH_MIN_NONLETTER = "minNonalphabetic";
    public static final String PUSH_MIN_NUMERIC = "minDigital";
    public static final String PUSH_MIN_SYMBOLS = "minSymbols";
    public static final String PUSH_MAX_PIN_AGE = "maxPINAgeInDays";
    public static final String PUSH_MAX_INACTIVITY = "maxInactivity";
    public static final String PUSH_MAX_FAILED_ATTEMP = "maxFailedAttempts";
    public static final String PUSH_PINE_HISTORY = "pinHistory";

    public static final String PUSH_RESTRICTION = "restriction";
    public static final String PUSH_DISABLE_CAMERA = "disableCamera";
    public static final String PUSH_DISABLE_SDCARD = "disableSDCard";
    public static final String PUSH_PINGAN_GPS = "pinganGps";

    // wangpf add
    public static final String PUSH_SAMSUNG_DISABLE_SDCARD = "sam-s-allowSDCard";
    public static final String PUSH_SAMSUNG_DISABLE_BLUETOOTH = "sam-s-allowBluetooth";
    public static final String PUSH_SAMSUNB_DISABLE_WIFI = "sam-s-allowWifi";
    public static final String PUSH_SAMSUNG_DISABLE_USB = "sam-s-allowUSB";
    public static final String PUSH_SAMSUNG_DISABLE_MICROPHONE = "sam-s-allowMicroPhone";
    public static final String PUSH_SAMSUNG_DISABLE_NFC = "sam-s-allowNFC";
    public static final String PUSH_SAMSUNG_DISABLE_GPS = "sam-s-allowGPS";
    public static final String PUSH_SAMSUNG_DISABLE_VPN = "sam-s-allowVPN";
    public static final String PUSH_SAMSUNG_DISABLE_3G = "sam-s-allow3G";
    public static final String PUSH_SAMSUNG_DISABLE_OSUPDATE = "sam-s-allowOSUpdate";
    public static final String PUSH_SAMSUNG_DISABLE_SETTING = "sam-s-allowSetting";
    public static final String PUSH_SAMSUNG_DISABLE_NATIVEBROWSER = "sam-s-allowNativeBrowser";
    public static final String PUSH_SAMSUNG_DISABLE_CAMERA = "sam-s-allowCamera";

    public static final String PUSH_SUMSUNG_NAME = "sam-s-name";
    public static final String PUSH_SUMSUNG_APN = "sam-s-apn";
    public static final String PUSH_SUMSUNG_AUTHTYPE = "sam-s-authType ";
    public static final String PUSH_SUMSUNG_MCC = "sam-s-mcc";
    public static final String PUSH_SUMSUNG_MMSPORT = "sam-s-mmsPort";
    public static final String PUSH_SUMSUNG_MMSPROXY = "sam-s-mmsProxy";
    public static final String PUSH_SUMSUNG_MMSC = "sam-s-mmsc";
    public static final String PUSH_SUMSUNG_MNC = "sam-s-mnc";
    public static final String PUSH_SUMSUNG_PASSWORD = "sam-s-password";
    public static final String PUSH_SUMSUNG_PORT = "sam-s-port";
    public static final String PUSH_SUMSUNG_PROXY = "sam-s-proxy";
    public static final String PUSH_SUMSUNG_SERVER = "sam-s-server";
    public static final String PUSH_SUMSUNG_TYPE = "sam-s-type";
    public static final String PUSH_SUMSUNG_USER = "sam-s-user";

    public static final String PUSH_ENCRYP = "encryption";
    public static final String PUSH_STORAG_ENCRYP = "storageEncryption";
    public static final String PUSH_WIFI = "wifi";
    public static final String PUSH_SSID = "SSID";
    public static final String PUSH_ENCRY_TYPE = "encryptionType";
    public static final String PUSH_AUTO_JOIN = "autoJoin";
    public static final String PUSH_HIDDEN_NETWORK = "hiddenNetwork";
    public static final String PUSH_VPN = "vpn";
    public static final String PUSH_NAME = "name";
    public static final String PUSH_TYPE = "type";
    public static final String PUSH_SERVER = "server";
    public static final String PUSH_USERNAME = "username";
    public static final String PUSH_APN = "apn";
    public static final String PUSH_PROXY_HOST = "proxyHost";
    public static final String PUSH_PROXY_PORT = "proxyPort";
    public static final String PUSH_DEL = "del";
    public static final String PUSH_FORMAT_SDCARD = "formatSDcard";
    public static final String PUSH_POLICY_NAME = "name";
    public static final String PUSH_POLICY_DESC = "description";
    public static final String PUSH_ISREMOVABLE = "isRemovable";
    public static final String PUSH_REMOVAL_PWD = "RemovalPassword";
    public static final String PUSH_CERT = "cert";

    public static final String PUSH_MEM = "mem";
    public static final String PUSH_MEM_IP = "ip";
    public static final String PUSH_MEM_PORT = "port";
    public static final String PUSH_MEM_EMAIL = "email";

    // anjx add 0124 企业wifi
    public static final String PUSH_EAP = "eap";
    public static final String PUSH_PHASE2 = "phase2";
    public static final String PUSH_IDENT = "ident";
    public static final String PUSH_ANON_IDENT = "anonIdent";
    public static final String PUSH_CERT_ID = "certId";
    public static final String PUSH_CERT_NAME = "certName";
    public static final String PUSH_CERT_URL = "certUrl";
    public static final String PUSH_CERT_TYPE = "certType";
    public static final String PUSH_CERT_PWD = "certPwd";

    public static final String PUSH_CA_CERT_ID = "caCertId";
    public static final String PUSH_CLIENT_CERTID = "clientCertId";

    // 合规
    public static final String PUSH_VIOLATION = "violation";
    public static final String PUSH_VIOLIATION_ID = "violationid";
    public static final String PUSH_CONDITION_TYPE = "conditiontype";
    public static final String PUSH_CONDITION_ID = "conditionid";
    public static final String PUSH_CONDITION_VALUE = "conditionvalue";
    public static final String PUSH_PROCESS_STRATEGY_ID = "processstrategyid";
    public static final String PUSH_PROCESS_STRATEGY = "processstrategy";
    public static final String PUSH_PROCESS_ACTION_ID = "processactionid";
    public static final String PUSH_PROCESS_DELAY_TIME = "processdelaytime";
    public static final String PUSH_PROCESS_VALUE = "processvalue";
    public static final String POLICY_LAST_UPLOAD_TIME = "strategylastuploadtime";

    // 民生 删除文件夹
    public static final String PUSH_DEL_FOLDER = "delfolder";
    public static final String PUSH_FOLDER_LIST = "folderlist";
    public static final String PUSH_FOLDER = "folder";

    // 平安定制
    public static final String PUSH_TOUCHDOWN = "touchdown";
    public static final String PUSH_EMAIL = "email";
    public static final String PUSH_IP = "ip";
    public static final String PUSH_DOMAIN = "domain";
    public static final String PUSH_USER = "user";
    public static final String PUSH_IS_SSL = "isSSL";
    public static final String PUSH_DISABLE_COPY_PASTE = "DisableCopyPaste";
    public static final String PUSH_ALLOW_STORAGECARD = "AllowStorageCard";
    public static final String PUSH_ATTACHMENTS_ENABLED = "AttachmentsEnabled";
    public static final String PUSH_WIPE = "wipe";

    //设备轨迹

    // 平台类型
    public static final int MODEL_TYPE_MODEL = 1; // 手机
    public static final int MODEL_TYPE_TABLET = 2;// 平板

    // 地图显示类型
    public static final String MAP_VIEW_TYPE_KEY = "map_view_type_key";
    public static final int MAP_VIEW_BAIDU = 1;
    public static final int MAP_VIEW_GOOGLE = 2;
    public static final int MAP_VIEW_MQPQUEST = 3;

    // 定位默认值
    public static final int LOCATE_MIN_TIME = 300000;
    public static final Double LOCATE_MIN_DISTANCE = 0.000005;

    // 应用下载安装状态
    public static final int PUSH_APP_DOWNLOAD_START = 3;// 开始下载
    public static final int PUSH_APP_DOWNLOAD_FAILURE = 4;// 下载取消/下载失败
    public static final int PUSH_APP_DOWNLOAD_SUCCESS = 6;// 下载完成/开始安装
    public static final int PUSH_APP_INSTALL_SUCCESS = 7;// 安装成功
    public static final int PUSH_APP_UNINSTALL = 9;// 用户卸载
    public static final int PUSH_APP_INSTALL_FAILURE = 10;// 安装失败

    // 应用无wifi是否提示
    public static final int APP_NO_WIFI_DOWNLOAD_TIP = 1;
    public static final int APP_NO_WIFI_DOWNLOAD_NO_TIP = 0;
    public static final int APP_TIP_TYPE_FORCE_INSTALL = 1;
    public static final int APP_TIP_TYPE_INSTALL = 2;

    // 定期联网是否上传位置信息
    public static final int ONNET_NO_UPLOAD_LOCATION = 0;
    public static final int ONNET_UPLOAD_LOCATION = 1;
    // 定时器相关参数
    public static final int TIMER_ONNET_DEFAULT_INTEVAL_FRE = 60;// 定期联网默认时间(分钟)
    public static final int TIMER_SETPWD_DEFAULT_INTEVAL_FRE = 1;// 设备密码默认时间(分钟)
    public static final String TIMER_STRA_PERIOD_KEY = "onNetStraPeriod";
    public static final String TIMER_STRA_VALID_DAY_KEY = "onNetStraValidDay";
    public static final String TIMER_STRA_BEG_KEY = "onNetStraBeg";
    public static final String TIMER_STRA_STATUS_KEY = "onNetStraStatus";

    // MEM
    public static final String MEM_DATA_DELIEVERED_KEY = "mem_data_delievered_key"; // mem数据是否下发,true:已下发，false:未下发
    public static final String MEM_IP_KEY = "mem_ip_key";
    public static final String MEM_PORT_KEY = "mem_prot_key";
    public static final String MEM_EMAIL_KEY = "mem_email_key";
    public static final String MEM_IS_ENABLE_KEY = "mem_is_enable"; // mem暂停:0,使用:1。
    public static final String MEM_PKG_NAME = "mem_pkg_name";
    public static final String MEM_PKG_URL = "mem_pkg_url";
    public static final String MEM_FOLLOW_NUMBER = "mem_follow_number";
    public static final String MEM_PKG_VERSION = "mem_pkg_version";

    // violation.cond.dict.app
    public static final int VIOLATION_APP_TYPE_WHITE = 1;
    public static final int VIOLATION_APP_TYPE_BLACK = 2;
    public static final int VIOLATION_APP_TYPE_MUST = 3;

    // wangpc 2013-7-30 ADD 添加设备更新信息
    public static final int N_DEV_TF = 1;
    public static final int N_DEV_BLUETOOTH = 2;
    public static final int N_DEV_WIFI = 3;
    public static final int N_DEV_CAMERA = 4;
    public static final int N_DEV_MICROPHONE = 5;
    public static final int N_DEV_NFC = 6;
    public static final int N_DEV_GPS = 7;
    public static final int N_DEV_3G = 10;
    public static final int N_DEV_GPS_LIMIT = 13; // User can't change GPS

    public static final String XML_TAG_SPECIAL_TYPE_FLAG = "SpecialTypeFlag";
    public static final String XML_TAG_SAMSUNG_SAFE = "SamsungSafe";
    public static final String XML_TAG_BLUETOOTH = "Bluetooth";
    public static final String XML_TAG_CAMERA = "Camera";
    public static final String XML_TAG_MICROPHONE = "MicroPhone";
    public static final String XML_TAG_NFC = "NFC";
    public static final String XML_TAG_SDCARD = "SDCard";
    public static final String XML_TAG_GPS = "GPS";

    // 统计局专用
    public static final String XML_Tag_PhoneNumber = "PhoneNumber";
    public static final String XML_Tag_RegionCode = "RegionCode";
    public static final String XML_Tag_EnrollType = "EnrollType";

    public static final String XML_Tag_AccountInfo = "AccountInfo";
    public static final String XML_Tag_AccountId = "AccountId";
    public static final String XML_Tag_AccountPwd = "AccountPwd";
    public static final String XML_Tag_AccountDisplayName = "AccountDisplayName";
    public static final String XML_ATTR_code = "code";

    public static final String XML_Tag_FileDownload = "FileDownload";
    public static final String XML_Tag_DocID = "DocID";

    public static final int OPERO_DOWNLOAD_FILE_SYNC = 3601;

    public static final int PUSH_OPER_DOWNLOAD_FILE = 421;//
    public static final int PUSH_OPER_DEL_FILE = 422;
    public static final int PUSH_OPER_RESET_PWD = 424;
    public static final int PUSH_OPER_FILE_LIST_UPLOAD = 425;
    public static final int PUSH_OPER_UPLOAD_LOC_PATH = 426;

    public static final String PUSH_UDID = "udid";

    // 下载文件 定制
    public static final String PUSH_DFS = "dfs";
    public static final String PUSH_DOC_ID = "docId";
    public static final String PUSH_DOWNLOAD_FILE = "downloadFile";
    public static final String PUSH_DIR = "dir";
    public static final String PUSH_DEPLOY_TYPE = "deployType";
    public static final String PUSH_DOC_TYPE = "docType";
    public static final String PUSH_MD5 = "md5";
    public static final String PUSH_FILE_NAME = "fileName";

    // 设备轨迹配置
    public static final String PUSH_DEVICE_TRAJECTORY = "deviceTrajectory";
    public static final String PUSH_DEVICE_TRAJECTORY_ENABLE = "deviceTrajectoryEnable";
    public static final String PUSH_REPORT_FREQUENCY = "reportFrequency";
    public static final String PUSH_LOCATION_FREQUENCY_TIME = "locationFrequencyTime";
    public static final String PUSH_DATA_SAVE_DAYS = "dataSaveDays";
    public static final String PUSH_LOCATION_DISTANCE = "locationDistance";

    public static final String USER_DISPLAY_NAME = "userDisplayName";
    public static final String USER_REGION_CODE = "userRegionCode";
    public static final String USER_SECTION_NAME = "userSectionName";

    // end
    // 新增普查区码
    public static final String XML_TAG_MAIN_REG_CODE = "MainRegCode";
    public static final String XML_TAG_NEW_REG_CODE = "NewRegCode";
    public static final String XML_TAG_DEL_REG_CODE_LIST = "DelRegCodeList";
    public static final String XML_TAG_DEL_REG_CODE = "DelRegCode";

    public static final String XML_TAG_SOUND_SETTING = "SoundSetting";
    public static final String XML_TAG_SHAKE_SETTING = "ShakeSetting";
    public static final int OPERO_CHANGE_PASSWORD = 3603;
    public static final String XML_Tag_ClientModifyPassswordInfo = "ClientModifyPasswordInfo";
    public static final String XML_Tag_NewUserPassword = "NewUserPassword";

    // public static final String APP_SERVER = "mdm.stats.gov.cn";
    // public static final String APP_SERVER="192.168.33.160";
    public static final String APP_PORT = "4431";

    // 推送消息类型
    public static final int NOTIFY_APP_HAS_UPDATE = 1;
    public static final int NOTIFY_NEW_APP_RELEASED = 2;

    // 连接错误细分
    // 未分类
    public static final int CE_NO_CLASSIFY = 2000;
    // 当前无网络
    public static final int CE_NO_NETWORK = 2001;
    // 请求报文为空
    public static final int CE_EMPTY_REQUEST = 2002;
    // 请求头设置失败
    public static final int CE_SET_REQUEST_HEADER = 2003;
    // 服务器连接超时
    public static final int CE_CONNECT_TIMEOUT = 2004;
    // 服务器读数据超时
    public static final int CE_READ_TIMEOUT = 2005;
    // 连接不上服务器,或者操作被取消
    public static final int CE_NO_CONNECT_SERVER = 2006;
    // 返回报文为空
    public static final int CE_EMPTY_PACKETS = 2007;
    // 解析报文错误
    public static final int CE_PARSE_FAILURE = 2008;

    public static final String XML_TAG_TenantID = "TenantID";
    public static final String XML_TAG_TENANTNAME = "TenantName";

    public static final String SP_REPORT_APP_CHANGE="sp_report_app_change";
    public static final String CURREN_SERVICE_IS_TONGJIJU = "is_Tongjiju";
    public static final String PUSH_TENANT = "tenant";
    public static final String PN_CONFIG = "pnConfig";

    //专业切换
    public static final int MSG_SECTION_CHANGE_SUCCESS = 0;
    public static final int MSG_SECTION_CHANGE_FAILED = 1;

    public static final String ssoDirPath = Environment.getExternalStorageDirectory().getPath() + "/sso";
    public static final String ssoFilePath = ssoDirPath + "/mdm_auto_account.xml";

    public static final int PUSH_OPER_LOGOUT_SECTION = 423;//

    //专业注销
    public static final int MSG_SECTION_LOGOUT_BEGING = 0;
    public static final int MSG_SECTION_LOGOUT_SUCCESS = 4;
    public static final int MSG_SECTION_LOGOUT_FAILED = 1;
    public static final int MSG_SECTION_LOGOUT_FAILED_NETWORK = 2;
    public static final int MSG_SECTION_LOGOUT_FAILED_SERVER = 3;


}
