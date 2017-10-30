local key_size = tonumber(arg[1])
local tokenLibrary = "ABCDEFGHIJKLMNOPQRSTUVXYWZ9"
local tokenLibrarySize = string.len(tokenLibrary)
local seed = ""

if key_size < 31 or key_size > 81 then
    print("key_size must be between 31 and 81")
    os.exit(1)
end

for i = 1, key_size do
    local p = math.random(tokenLibrarySize)
    local new_token = string.char(string.byte(tokenLibrary, p))
    seed = string.format("%s%s", seed, new_token)
end

print(seed)
