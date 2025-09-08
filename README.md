# Duranium Repairium 铿铀修复

## Features 功能

### Sync Player Abilities on Dimension Change 跨世界传送时同步玩家能力

Used to fix the problem where using FTB Essentials commands (`/warp`, `/spawn`, etc) to travel among dimensions will
cause abilities (including fly ability "mayfly", from `/fly`) de-sync, which means you "locally" not able to fly, when
the server allows you to.

用于修复使用 FTB Essentials 指令跨世界传送时，能力数据失去同步。你“在本地”不能飞行，但是服务器允许。
